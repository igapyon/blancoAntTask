/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.anttask.resourcebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * blancoAntTask�����p���郊�\�[�X�o���h����~���܂��B
 *
 * ���\�[�X�o���h����`: [BlancoAntTask]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 * ���m�̃��P�[��<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoAntTaskResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoAntTaskResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoAntTask]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public BlancoAntTaskResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/anttask/resourcebundle/BlancoAntTask");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoAntTaskResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoAntTask]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public BlancoAntTaskResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/anttask/resourcebundle/BlancoAntTask", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoAntTaskResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoAntTask]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public BlancoAntTaskResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/anttask/resourcebundle/BlancoAntTask", locale, loader);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g���擾���܂��B
     *
     * @return �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g�B
     */
    public ResourceBundle getResourceBundle() {
        return fResourceBundle;
    }

    /**
     * bundle[BlancoAntTask], key[METAFILE_DISPLAYNAME]
     *
     * [AntTask��`��] (ja)<br>
     *
     * @return key[METAFILE_DISPLAYNAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMetafileDisplayname() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "AntTask��`��";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METAFILE_DISPLAYNAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[ITEM_NO]
     *
     * [���ڔԍ�] (ja)<br>
     *
     * @return key[ITEM_NO]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getItemNo() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���ڔԍ�";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("ITEM_NO");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[ITEM_REQUIRED]
     *
     * [�K�{����] (ja)<br>
     *
     * @return key[ITEM_REQUIRED]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getItemRequired() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�K�{����";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("ITEM_REQUIRED");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[CLASSCOMMENT.01]
     *
     * [Apache Ant�^�X�N [{0}]�̃N���X�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CLASSCOMMENT.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "Apache Ant�^�X�N [{0}]�̃N���X�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[CLASSCOMMENT.02]
     *
     * [���̃N���X�ł́AApache Ant�^�X�N�ň�ʓI�ɕK�v�ȃ`�F�b�N�Ȃǂ̃R�[�f�B���O�������肵�܂��B] (ja)<br>
     *
     * @return key[CLASSCOMMENT.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���̃N���X�ł́AApache Ant�^�X�N�ň�ʓI�ɕK�v�ȃ`�F�b�N�Ȃǂ̃R�[�f�B���O�������肵�܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[CLASSCOMMENT.03]
     *
     * [���ۂ̏����� �p�b�P�[�W[{0}]��{1}�N���X���쐬���ċL�q���Ă��������B&lt;br&gt;] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CLASSCOMMENT.03]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment03(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���ۂ̏����� �p�b�P�[�W[{0}]��{1}�N���X���쐬���ċL�q���Ă��������B<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.03");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[CLASSCOMMENT.04]
     *
     * [Ant�^�X�N�ւ̑g�ݍ��ݗ�&lt;br&gt;] (ja)<br>
     *
     * @return key[CLASSCOMMENT.04]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment04() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "Ant�^�X�N�ւ̑g�ݍ��ݗ�<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.04");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[FIELD.COMMENT.01]
     *
     * [Ant�^�X�N��[{0}]�A�g���r���[�g�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[FIELD.COMMENT.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldComment01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "Ant�^�X�N��[{0}]�A�g���r���[�g�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.COMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[FIELD.COMMENT.02]
     *
     * [�t�B�[���h [{0}] �ɒl���Z�b�g���ꂽ���ǂ����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[FIELD.COMMENT.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldComment02(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�B�[���h [{0}] �ɒl���Z�b�g���ꂽ���ǂ����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.COMMENT.02");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[FIELD.COMMENT.VERBOSE]
     *
     * [verbose���[�h�œ��삳���邩�ǂ����B] (ja)<br>
     *
     * @return key[FIELD.COMMENT.VERBOSE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldCommentVerbose() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "verbose���[�h�œ��삳���邩�ǂ����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.COMMENT.VERBOSE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.SET.COMMENT.01]
     *
     * [Ant�^�X�N��[{0}]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[METHOD.SET.COMMENT.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodSetComment01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "Ant�^�X�N��[{0}]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.SET.COMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.SET.COMMENT.02]
     *
     * [�Z�b�g�������l] (ja)<br>
     *
     * @return key[METHOD.SET.COMMENT.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodSetComment02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�Z�b�g�������l";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.SET.COMMENT.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.SET.LINE.01]
     *
     * [Ant�^�X�N��[{0}]�A�g���r���[�g�ɗ^����ꂽ�l�̐��l��͂Ɏ��s���܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[METHOD.SET.LINE.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodSetLine01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "Ant�^�X�N��[{0}]�A�g���r���[�g�ɗ^����ꂽ�l�̐��l��͂Ɏ��s���܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.SET.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.GET.COMMENT.01]
     *
     * [Ant�^�X�N��[{0}]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[METHOD.GET.COMMENT.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodGetComment01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "Ant�^�X�N��[{0}]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.GET.COMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.GET.COMMENT.11]
     *
     * [�K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B&lt;br&gt;] (ja)<br>
     *
     * @return key[METHOD.GET.COMMENT.11]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodGetComment11() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.GET.COMMENT.11");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.GET.COMMENT.12]
     *
     * [�f�t�H���g�l[{0}]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B&lt;br&gt;] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[METHOD.GET.COMMENT.12]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodGetComment12(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�f�t�H���g�l[{0}]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.GET.COMMENT.12");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.GET.COMMENT.13]
     *
     * [���̃t�B�[���h�̒l] (ja)<br>
     *
     * @return key[METHOD.GET.COMMENT.13]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodGetComment13() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���̃t�B�[���h�̒l";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.GET.COMMENT.13");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.COMMENT.01]
     *
     * [Ant�^�X�N�̃��C�������BApache Ant���� ���̃��\�b�h���Ăяo����܂��B] (ja)<br>
     *
     * @return key[METHOD.EXECUTE.COMMENT.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodExecuteComment01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "Ant�^�X�N�̃��C�������BApache Ant���� ���̃��\�b�h���Ăяo����܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.COMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.COMMENT.02]
     *
     * [�^�X�N�Ƃ��Ă̗�O�����������ꍇ�B] (ja)<br>
     *
     * @return key[METHOD.EXECUTE.COMMENT.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodExecuteComment02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^�X�N�Ƃ��Ă̗�O�����������ꍇ�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.COMMENT.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.LINE.01]
     *
     * [// {0}�A�g���r���[�g[{1}]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[METHOD.EXECUTE.LINE.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodExecuteLine01(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// {0}�A�g���r���[�g[{1}]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.LINE.02]
     *
     * [�K�{�A�g���r���[�g[{0}]���ݒ肳��Ă��܂���B�����𒆒f���܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[METHOD.EXECUTE.LINE.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodExecuteLine02(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�K�{�A�g���r���[�g[{0}]���ݒ肳��Ă��܂���B�����𒆒f���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.LINE.02");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.LINE.04]
     *
     * [// ���ۂ�Ant�^�X�N�̎又�������s���܂��B] (ja)<br>
     *
     * @return key[METHOD.EXECUTE.LINE.04]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodExecuteLine04() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// ���ۂ�Ant�^�X�N�̎又�������s���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.LINE.04");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.LINE.05]
     *
     * [�^�X�N���������ɗ�O���������܂����B�����𒆒f���܂��B] (ja)<br>
     *
     * @return key[METHOD.EXECUTE.LINE.05]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodExecuteLine05() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^�X�N���������ɗ�O���������܂����B�����𒆒f���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.LINE.05");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoAntTask], key[METHOD.EXECUTE.LINE.06]
     *
     * [�^�X�N���������ɃG���[���������܂����B�����𒆒f���܂��B] (ja)<br>
     *
     * @return key[METHOD.EXECUTE.LINE.06]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMethodExecuteLine06() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^�X�N���������ɃG���[���������܂����B�����𒆒f���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METHOD.EXECUTE.LINE.06");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }
}
