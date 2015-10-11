/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.anttask.valueobject;

import java.util.List;

/**
 * blancoAntTask�̂Ȃ��ŗ��p�����ValueObject�ł��B
 */
public class BlancoAntTaskStructure {
    /**
     * �^�X�N�����w�肵�܂��B�K�{���ڂł��B
     *
     * �t�B�[���h: [name]�B
     */
    private String fName;

    /**
     * �p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B
     *
     * �t�B�[���h: [package]�B
     */
    private String fPackage;

    /**
     * �������L�ڂ��܂��B
     *
     * �t�B�[���h: [description]�B
     */
    private String fDescription;

    /**
     * �N���X���̌���ɕt�^�����T�t�B�b�N�X�B
     *
     * �t�B�[���h: [suffix]�B
     */
    private String fSuffix;

    /**
     * �A�g���r���[�g��ێ����郊�X�g�B
     *
     * �t�B�[���h: [attributeList]�B
     * �f�t�H���g: [new java.util.ArrayList<blanco.anttask.valueobject.BlancoAntTaskAttributeStructure>()]�B
     */
    private List<blanco.anttask.valueobject.BlancoAntTaskAttributeStructure> fAttributeList = new java.util.ArrayList<blanco.anttask.valueobject.BlancoAntTaskAttributeStructure>();

    /**
     * �t�B�[���h [name] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�^�X�N�����w�肵�܂��B�K�{���ڂł��B]�B
     *
     * @param argName �t�B�[���h[name]�ɐݒ肷��l�B
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * �t�B�[���h [name] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�^�X�N�����w�肵�܂��B�K�{���ڂł��B]�B
     *
     * @return �t�B�[���h[name]����擾�����l�B
     */
    public String getName() {
        return fName;
    }

    /**
     * �t�B�[���h [package] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B]�B
     *
     * @param argPackage �t�B�[���h[package]�ɐݒ肷��l�B
     */
    public void setPackage(final String argPackage) {
        fPackage = argPackage;
    }

    /**
     * �t�B�[���h [package] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�p�b�P�[�W�����w�肵�܂��B�K�{���ڂł��B]�B
     *
     * @return �t�B�[���h[package]����擾�����l�B
     */
    public String getPackage() {
        return fPackage;
    }

    /**
     * �t�B�[���h [description] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�������L�ڂ��܂��B]�B
     *
     * @param argDescription �t�B�[���h[description]�ɐݒ肷��l�B
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * �t�B�[���h [description] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�������L�ڂ��܂��B]�B
     *
     * @return �t�B�[���h[description]����擾�����l�B
     */
    public String getDescription() {
        return fDescription;
    }

    /**
     * �t�B�[���h [suffix] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�N���X���̌���ɕt�^�����T�t�B�b�N�X�B]�B
     *
     * @param argSuffix �t�B�[���h[suffix]�ɐݒ肷��l�B
     */
    public void setSuffix(final String argSuffix) {
        fSuffix = argSuffix;
    }

    /**
     * �t�B�[���h [suffix] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�N���X���̌���ɕt�^�����T�t�B�b�N�X�B]�B
     *
     * @return �t�B�[���h[suffix]����擾�����l�B
     */
    public String getSuffix() {
        return fSuffix;
    }

    /**
     * �t�B�[���h [attributeList] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�A�g���r���[�g��ێ����郊�X�g�B]�B
     *
     * @param argAttributeList �t�B�[���h[attributeList]�ɐݒ肷��l�B
     */
    public void setAttributeList(final List<blanco.anttask.valueobject.BlancoAntTaskAttributeStructure> argAttributeList) {
        fAttributeList = argAttributeList;
    }

    /**
     * �t�B�[���h [attributeList] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�A�g���r���[�g��ێ����郊�X�g�B]�B
     * �f�t�H���g: [new java.util.ArrayList<blanco.anttask.valueobject.BlancoAntTaskAttributeStructure>()]�B
     *
     * @return �t�B�[���h[attributeList]����擾�����l�B
     */
    public List<blanco.anttask.valueobject.BlancoAntTaskAttributeStructure> getAttributeList() {
        return fAttributeList;
    }

    /**
     * ���̃o�����[�I�u�W�F�N�g�̕�����\�����擾���܂��B
     *
     * <P>�g�p��̒���</P>
     * <UL>
     * <LI>�I�u�W�F�N�g�̃V�����[�͈͂̂ݕ����񉻂̏����ΏۂƂȂ�܂��B
     * <LI>�I�u�W�F�N�g���z�Q�Ƃ��Ă���ꍇ�ɂ́A���̃��\�b�h�͎g��Ȃ��ł��������B
     * </UL>
     *
     * @return �o�����[�I�u�W�F�N�g�̕�����\���B
     */
    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("blanco.anttask.valueobject.BlancoAntTaskStructure[");
        buf.append("name=" + fName);
        buf.append(",package=" + fPackage);
        buf.append(",description=" + fDescription);
        buf.append(",suffix=" + fSuffix);
        buf.append(",attributeList=" + fAttributeList);
        buf.append("]");
        return buf.toString();
    }
}
