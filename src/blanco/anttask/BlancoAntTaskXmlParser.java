/*
 * blanco Framework
 * Copyright (C) 2004-2006 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.anttask;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import blanco.anttask.message.BlancoAntTaskMessage;
import blanco.anttask.valueobject.BlancoAntTaskAttributeStructure;
import blanco.anttask.valueobject.BlancoAntTaskStructure;
import blanco.commons.util.BlancoStringUtil;
import blanco.xml.bind.BlancoXmlBindingUtil;
import blanco.xml.bind.BlancoXmlUnmarshaller;
import blanco.xml.bind.valueobject.BlancoXmlDocument;
import blanco.xml.bind.valueobject.BlancoXmlElement;

/**
 * �u�o�b�`������`���vExcel�l��������𒊏o���܂��B
 * 
 * ���̃N���X�́A����XML�t�@�C�������񒊏o����@�\��S���܂��B
 * 
 * @author IGA Tosiki
 */
public class BlancoAntTaskXmlParser {
    /**
     * ���b�Z�[�W��`�B
     */
    protected final BlancoAntTaskMessage fMsg = new BlancoAntTaskMessage();

    /**
     * ����XML�t�@�C����XML�h�L�������g���p�[�X���āA���̔z����擾���܂��B
     * 
     * @param argMetaXmlSourceFile
     *            ����XML�t�@�C���B
     * @return �p�[�X�̌��ʓ���ꂽ���̔z��B
     */
    public BlancoAntTaskStructure[] parse(final File argMetaXmlSourceFile) {
        final BlancoXmlDocument documentMeta = new BlancoXmlUnmarshaller()
                .unmarshal(argMetaXmlSourceFile);
        if (documentMeta == null) {
            return null;
        }

        return parse(documentMeta);
    }

    /**
     * ����XML�t�@�C���`����XML�h�L�������g���p�[�X���āA�o�����[�I�u�W�F�N�g���̔z����擾���܂��B
     * 
     * @param argXmlDocument
     *            ����XML�t�@�C����XML�h�L�������g�B
     * @return �p�[�X�̌��ʓ���ꂽ�o�����[�I�u�W�F�N�g���̔z��B
     */
    public BlancoAntTaskStructure[] parse(final BlancoXmlDocument argXmlDocument) {
        final List<BlancoAntTaskStructure> listStructure = new ArrayList<BlancoAntTaskStructure>();
        // ���[�g�G�������g���擾���܂��B
        final BlancoXmlElement elementRoot = BlancoXmlBindingUtil
                .getDocumentElement(argXmlDocument);
        if (elementRoot == null) {
            // ���[�g�G�������g�������ꍇ�ɂ͏������f���܂��B
            return null;
        }

        // sheet(Excel�V�[�g)�̃��X�g���擾���܂��B
        final List<blanco.xml.bind.valueobject.BlancoXmlElement> listSheet = BlancoXmlBindingUtil
                .getElementsByTagName(elementRoot, "sheet");
        final int sizeListSheet = listSheet.size();
        for (int index = 0; index < sizeListSheet; index++) {
            final BlancoXmlElement elementSheet = listSheet.get(index);

            final BlancoAntTaskStructure structure = parseElementSheet(elementSheet);
            if (structure != null) {
                // ����ꂽ�����L�����܂��B
                listStructure.add(structure);
            }
        }

        final BlancoAntTaskStructure[] result = new BlancoAntTaskStructure[listStructure
                .size()];
        listStructure.toArray(result);
        return result;
    }

    /**
     * ����XML�t�@�C���`���́usheet�vXML�G�������g���p�[�X���āA�o�����[�I�u�W�F�N�g�����擾���܂��B
     * 
     * @param argElementSheet
     *            ����XML�t�@�C���́usheet�vXML�G�������g�B
     * @return �p�[�X�̌��ʓ���ꂽ�o�����[�I�u�W�F�N�g���B�uname�v��������Ȃ������ꍇ�ɂ� null��߂��܂��B
     */
    public BlancoAntTaskStructure parseElementSheet(
            final BlancoXmlElement argElementSheet) {
        final BlancoAntTaskStructure structure = new BlancoAntTaskStructure();
        // ���̓p�����[�^�����擾���܂��B

        final List<blanco.xml.bind.valueobject.BlancoXmlElement> listCommon = BlancoXmlBindingUtil
                .getElementsByTagName(argElementSheet, "blancoanttask-common");
        if (listCommon.size() == 0) {
            // common�������ꍇ�ɂ̓X�L�b�v���܂��B
            return null;
        }

        // �ŏ��̃A�C�e���̂ݏ������Ă��܂��B
        final BlancoXmlElement elementCommon = listCommon.get(0);

        // �V�[�g����ڍׂȏ����擾���܂��B
        structure.setName(BlancoXmlBindingUtil.getTextContent(elementCommon,
                "taskName"));
        structure.setPackage(BlancoXmlBindingUtil.getTextContent(elementCommon,
                "packageName"));

        if (BlancoStringUtil.null2Blank(structure.getName()).length() == 0) {
            return null;
        }

        if (BlancoStringUtil.null2Blank(structure.getPackage()).trim().length() == 0) {
            throw new IllegalArgumentException("�p�b�P�[�W�����w�肳��Ă��܂���["
                    + structure.getName() + "]");
        }

        if (BlancoXmlBindingUtil.getTextContent(elementCommon, "description") != null) {
            structure.setDescription(BlancoXmlBindingUtil.getTextContent(
                    elementCommon, "description"));
        }

        if (BlancoXmlBindingUtil.getTextContent(elementCommon, "suffix") != null) {
            structure.setSuffix(BlancoXmlBindingUtil.getTextContent(
                    elementCommon, "suffix"));
        }

        final BlancoXmlElement elementAttributes = BlancoXmlBindingUtil
                .getElement(argElementSheet, "blancoanttask-list");
        if (elementAttributes == null) {
            return null;
        }

        // �ꗗ�̓��e���擾���܂��B
        final List<blanco.xml.bind.valueobject.BlancoXmlElement> listField = BlancoXmlBindingUtil
                .getElementsByTagName(elementAttributes, "attribute");
        for (int indexField = 0; indexField < listField.size(); indexField++) {
            final BlancoXmlElement elementField = listField.get(indexField);

            final BlancoAntTaskAttributeStructure attributeStructure = new BlancoAntTaskAttributeStructure();

            attributeStructure.setNo(BlancoXmlBindingUtil.getTextContent(
                    elementField, "no"));
            attributeStructure.setName(BlancoXmlBindingUtil.getTextContent(
                    elementField, "attribute"));
            if (BlancoStringUtil.null2Blank(attributeStructure.getName())
                    .length() == 0) {
                // attribute���w�肳��Ă��Ȃ��ꍇ�ɂ͏������܂���B
                continue;
            }

            if (BlancoStringUtil.null2Blank(
                    BlancoXmlBindingUtil.getTextContent(elementField, "type"))
                    .length() > 0) {
                attributeStructure.setType(BlancoXmlBindingUtil.getTextContent(
                        elementField, "type"));
            }

            attributeStructure.setRequire("true".equals(BlancoXmlBindingUtil
                    .getTextContent(elementField, "require")));
            attributeStructure.setDefault(BlancoXmlBindingUtil.getTextContent(
                    elementField, "default"));
            attributeStructure.setDescription(BlancoXmlBindingUtil
                    .getTextContent(elementField, "description"));

            if (attributeStructure.getRequire()) {
                if (BlancoStringUtil
                        .null2Blank(attributeStructure.getDefault()).length() > 0) {
                    // �^�X�N��[{0}]�A�A�g���r���[�g[{1}]�ɂ����āA[�K�{]��[�f�t�H���g]�������Ɏw�肳��Ă��܂��B
                    // ������[�K�{]��[�f�t�H���g]�͔r���I�ɁA�����������ꂩ�͎w�肷��K�v������܂��B
                    throw new IllegalArgumentException(fMsg.getMbati001(
                            structure.getName(), attributeStructure.getName()));
                }
            }

            structure.getAttributeList().add(attributeStructure);
        }

        return structure;
    }
}
