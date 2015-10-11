/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.sample.task;

import java.io.IOException;
import java.math.BigDecimal;

import blanco.sample.task.valueobject.BlancoAntTaskSampleProcessInput;

/**
 * �o�b�`�����N���X [BlancoAntTaskSampleBatchProcess]�B
 *
 * <P>�o�b�`�����̌Ăяo����B</P>
 * <code>
 * java -classpath (�N���X�p�X) blanco.sample.task.BlancoAntTaskSampleBatchProcess -help
 * </code>
 */
public class BlancoAntTaskSampleBatchProcess {
    /**
     * ����I���B
     */
    public static final int END_SUCCESS = 0;

    /**
     * ���ُ͈�I���B�����I��java.lang.IllegalArgumentException�����������ꍇ�B
     */
    public static final int END_ILLEGAL_ARGUMENT_EXCEPTION = 7;

    /**
     * ���o�͗�O�I���B�����I��java.io.IOException�����������ꍇ�B
     */
    public static final int END_IO_EXCEPTION = 8;

    /**
     * �ُ�I���B�o�b�`�̏����J�n�Ɏ��s�����ꍇ�A����ѓ����I��java.lang.Error�܂���java.lang.RuntimeException�����������ꍇ�B
     */
    public static final int END_ERROR = 9;

    /**
     * �R�}���h���C��������s���ꂽ�ۂ̃G���g���|�C���g�ł��B
     *
     * @param args �R���\�[����������p���ꂽ�����B
     */
    public static final void main(final String[] args) {
        final BlancoAntTaskSampleBatchProcess batchProcess = new BlancoAntTaskSampleBatchProcess();

        // �o�b�`�����̈����B
        final BlancoAntTaskSampleProcessInput input = new BlancoAntTaskSampleProcessInput();

        boolean isNeedUsage = false;
        boolean isFieldAttr1Processed = false;
        boolean isFieldAttr3Processed = false;
        boolean isFieldAttr5Processed = false;
        boolean isFieldAttr7Processed = false;
        boolean isFieldAttr9Processed = false;

        // �R�}���h���C�������̉�͂������Ȃ��܂��B
        for (int index = 0; index < args.length; index++) {
            String arg = args[index];
            if (arg.startsWith("-verbose=")) {
                input.setVerbose(Boolean.valueOf(arg.substring(9)).booleanValue());
            } else if (arg.startsWith("-attr1=")) {
                input.setAttr1(arg.substring(7));
                isFieldAttr1Processed = true;
            } else if (arg.startsWith("-attr2=")) {
                input.setAttr2(arg.substring(7));
            } else if (arg.startsWith("-attr3=")) {
                try {
                    input.setAttr3(Integer.parseInt(arg.substring(7)));
                } catch (NumberFormatException e) {
                    System.out.println("BlancoAntTaskSampleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̃t�B�[���h[attr3]�𐔒l(int)�Ƃ��ăp�[�X�����݂܂��������s���܂����B: " + e.toString());
                    System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
                }
                isFieldAttr3Processed = true;
            } else if (arg.startsWith("-attr4=")) {
                try {
                    input.setAttr4(Integer.parseInt(arg.substring(7)));
                } catch (NumberFormatException e) {
                    System.out.println("BlancoAntTaskSampleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̃t�B�[���h[attr4]�𐔒l(int)�Ƃ��ăp�[�X�����݂܂��������s���܂����B: " + e.toString());
                    System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
                }
            } else if (arg.startsWith("-attr5=")) {
                try {
                    input.setAttr5(Long.parseLong(arg.substring(7)));
                } catch (NumberFormatException e) {
                    System.out.println("BlancoAntTaskSampleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̃t�B�[���h[attr5]�𐔒l(long)�Ƃ��ăp�[�X�����݂܂��������s���܂����B: " + e.toString());
                    System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
                }
                isFieldAttr5Processed = true;
            } else if (arg.startsWith("-attr6=")) {
                try {
                    input.setAttr6(Long.parseLong(arg.substring(7)));
                } catch (NumberFormatException e) {
                    System.out.println("BlancoAntTaskSampleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̃t�B�[���h[attr6]�𐔒l(long)�Ƃ��ăp�[�X�����݂܂��������s���܂����B: " + e.toString());
                    System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
                }
            } else if (arg.startsWith("-attr7=")) {
                try {
                    input.setAttr7(new BigDecimal(arg.substring(7)));
                } catch (NumberFormatException e) {
                    System.out.println("BlancoAntTaskSampleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̃t�B�[���h[attr7]�𐔒l(decimal)�Ƃ��ăp�[�X�����݂܂��������s���܂����B: " + e.toString());
                    System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
                }
                isFieldAttr7Processed = true;
            } else if (arg.startsWith("-attr8=")) {
                try {
                    input.setAttr8(new BigDecimal(arg.substring(7)));
                } catch (NumberFormatException e) {
                    System.out.println("BlancoAntTaskSampleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̃t�B�[���h[attr8]�𐔒l(decimal)�Ƃ��ăp�[�X�����݂܂��������s���܂����B: " + e.toString());
                    System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
                }
            } else if (arg.startsWith("-attr9=")) {
                input.setAttr9(Boolean.valueOf(arg.substring(7)).booleanValue());
                isFieldAttr9Processed = true;
            } else if (arg.startsWith("-attr10=")) {
                input.setAttr10(Boolean.valueOf(arg.substring(8)).booleanValue());
            } else if (arg.equals("-?") || arg.equals("-help")) {
                usage();
                System.exit(END_SUCCESS);
            } else {
                System.out.println("BlancoAntTaskSampleBatchProcess: ���̓p�����[�^[" + arg + "]�͖�������܂����B");
                isNeedUsage = true;
            }
        }

        if (isNeedUsage) {
            usage();
        }

        if( isFieldAttr1Processed == false) {
            System.out.println("BlancoAntTaskSampleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̕K�{�t�B�[���h�l[attr1]�ɒl���ݒ肳��Ă��܂���B");
            System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
        }
        if( isFieldAttr3Processed == false) {
            System.out.println("BlancoAntTaskSampleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̕K�{�t�B�[���h�l[attr3]�ɒl���ݒ肳��Ă��܂���B");
            System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
        }
        if( isFieldAttr5Processed == false) {
            System.out.println("BlancoAntTaskSampleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̕K�{�t�B�[���h�l[attr5]�ɒl���ݒ肳��Ă��܂���B");
            System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
        }
        if( isFieldAttr7Processed == false) {
            System.out.println("BlancoAntTaskSampleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̕K�{�t�B�[���h�l[attr7]�ɒl���ݒ肳��Ă��܂���B");
            System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
        }
        if( isFieldAttr9Processed == false) {
            System.out.println("BlancoAntTaskSampleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̕K�{�t�B�[���h�l[attr9]�ɒl���ݒ肳��Ă��܂���B");
            System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
        }

        int retCode = batchProcess.execute(input);

        // �I���R�[�h��߂��܂��B
        // �����ӁFSystem.exit()���Ăяo���Ă���_�ɒ��ӂ��Ă��������B
        System.exit(retCode);
    }

    /**
     * ��̓I�ȃo�b�`�������e���L�q���邽�߂̃��\�b�h�ł��B
     *
     * ���̃��\�b�h�Ɏ��ۂ̏������e���L�q���܂��B
     *
     * @param input �o�b�`�����̓��̓p�����[�^�B
     * @return �o�b�`�����̏I���R�[�h�BEND_SUCCESS, END_ILLEGAL_ARGUMENT_EXCEPTION, END_IO_EXCEPTION, END_ERROR �̂����ꂩ�̒l��߂��܂��B
     * @throws IOException ���o�͗�O�����������ꍇ�B
     * @throws IllegalArgumentException ���͒l�ɕs�������������ꍇ�B
     */
    public int process(final BlancoAntTaskSampleProcessInput input) throws IOException, IllegalArgumentException {
        // ���̓p�����[�^���`�F�b�N���܂��B
        validateInput(input);

        // ���̉ӏ��ŃR���p�C���G���[����������ꍇ�ABlancoAntTaskSampleProcess�C���^�t�F�[�X���������� blanco.sample.task�p�b�P�[�W�� BlancoAntTaskSampleProcessImpl�N���X���쐬���邱�Ƃɂ������ł���ꍇ������܂��B
        final BlancoAntTaskSampleProcess process = new BlancoAntTaskSampleProcessImpl();

        // �����̖{�̂����s���܂��B
        final int retCode = process.execute(input);

        return retCode;
    }

    /**
     * �N���X���C���X�^���X�����ăo�b�`�����s����ۂ̃G���g���|�C���g�ł��B
     *
     * ���̃��\�b�h�͉��L�̎d�l��񋟂��܂��B
     * <ul>
     * <li>���\�b�h�̓��̓p�����[�^�̓��e�`�F�b�N�B
     * <li>IllegalArgumentException, RuntimeException, Error�Ȃǂ̗�O��catch���Ė߂�l�ւƕϊ��B
     * </ul>
     *
     * @param input �o�b�`�����̓��̓p�����[�^�B
     * @return �o�b�`�����̏I���R�[�h�BEND_SUCCESS, END_ILLEGAL_ARGUMENT_EXCEPTION, END_IO_EXCEPTION, END_ERROR �̂����ꂩ�̒l��߂��܂��B
     * @throws IllegalArgumentException ���͒l�ɕs�������������ꍇ�B
     */
    public final int execute(final BlancoAntTaskSampleProcessInput input) throws IllegalArgumentException {
        try {
            // �o�b�`�����̖{�̂����s���܂��B
            int retCode = process(input);

            return retCode;
        } catch (IllegalArgumentException ex) {
            System.out.println("BlancoAntTaskSampleBatchProcess: ���͗�O���������܂����B�o�b�`�����𒆒f���܂��B:" + ex.toString());
            // ���ُ͈�I���B
            return END_ILLEGAL_ARGUMENT_EXCEPTION;
        } catch (IOException ex) {
            System.out.println("BlancoAntTaskSampleBatchProcess: ���o�͗�O���������܂����B�o�b�`�����𒆒f���܂��B:" + ex.toString());
            // ���ُ͈�I���B
            return END_IO_EXCEPTION;
        } catch (RuntimeException ex) {
            System.out.println("BlancoAntTaskSampleBatchProcess: �����^�C����O���������܂����B�o�b�`�����𒆒f���܂��B:" + ex.toString());
            ex.printStackTrace();
            // �ُ�I���B
            return END_ERROR;
        } catch (Error er) {
            System.out.println("BlancoAntTaskSampleBatchProcess: �����^�C���G���[���������܂����B�o�b�`�����𒆒f���܂��B:" + er.toString());
            er.printStackTrace();
            // �ُ�I���B
            return END_ERROR;
        }
    }

    /**
     * ���̃o�b�`�����N���X�̎g�����̐�����W���o�͂Ɏ������߂̃��\�b�h�ł��B
     */
    public static final void usage() {
        System.out.println("BlancoAntTaskSampleBatchProcess: Usage:");
        System.out.println("  java blanco.sample.task.BlancoAntTaskSampleBatchProcess -verbose=�l1 -attr1=�l2 -attr2=�l3 -attr3=�l4 -attr4=�l5 -attr5=�l6 -attr6=�l7 -attr7=�l8 -attr8=�l9 -attr9=�l10 -attr10=�l11");
        System.out.println("    -verbose");
        System.out.println("      ����[verbose���[�h�œ��삳���邩�ǂ����B]");
        System.out.println("      �^[�^�U]");
        System.out.println("      �f�t�H���g�l[false]");
        System.out.println("    -attr1");
        System.out.println("      ����[������i�K�{�j]");
        System.out.println("      �^[������]");
        System.out.println("      �K�{�p�����[�^");
        System.out.println("    -attr2");
        System.out.println("      ����[blanco:string]");
        System.out.println("      �^[������]");
        System.out.println("      �f�t�H���g�l[�f�t�H���g]");
        System.out.println("    -attr3");
        System.out.println("      ����[����(int)(�K�{)]");
        System.out.println("      �^[���l(int)]");
        System.out.println("      �K�{�p�����[�^");
        System.out.println("    -attr4");
        System.out.println("      ����[blanco:int]");
        System.out.println("      �^[���l(int)]");
        System.out.println("      �f�t�H���g�l[10]");
        System.out.println("    -attr5");
        System.out.println("      ����[����(long)(�K�{)]");
        System.out.println("      �^[���l(long)]");
        System.out.println("      �K�{�p�����[�^");
        System.out.println("    -attr6");
        System.out.println("      ����[blanco:long]");
        System.out.println("      �^[���l(long)]");
        System.out.println("      �f�t�H���g�l[100]");
        System.out.println("    -attr7");
        System.out.println("      ����[����(decimal)(�K�{)]");
        System.out.println("      �^[���l(decimal)]");
        System.out.println("      �K�{�p�����[�^");
        System.out.println("    -attr8");
        System.out.println("      ����[����(decimal)]");
        System.out.println("      �^[���l(decimal)]");
        System.out.println("      �f�t�H���g�l[123.456]");
        System.out.println("    -attr9");
        System.out.println("      ����[�^�U(�K�{)]");
        System.out.println("      �^[�^�U]");
        System.out.println("      �K�{�p�����[�^");
        System.out.println("    -attr10");
        System.out.println("      ����[blanco:boolean]");
        System.out.println("      �^[�^�U]");
        System.out.println("      �f�t�H���g�l[true]");
        System.out.println("    -? , -help");
        System.out.println("      ����[�g������\�����܂��B]");
    }

    /**
     * ���̃o�b�`�����N���X�̓��̓p�����[�^�̑Ó����`�F�b�N�����{���邽�߂̃��\�b�h�ł��B
     *
     * @param input �o�b�`�����̓��̓p�����[�^�B
     * @throws IllegalArgumentException ���͒l�ɕs�������������ꍇ�B
     */
    public void validateInput(final BlancoAntTaskSampleProcessInput input) throws IllegalArgumentException {
        if (input == null) {
            throw new IllegalArgumentException("BlancoBatchProcessBatchProcess: �����J�n���s�B���̓p�����[�^[input]��null���^�����܂����B");
        }
        if (input.getAttr1() == null) {
            throw new IllegalArgumentException("BlancoAntTaskSampleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̕K�{�t�B�[���h�l[attr1]�ɒl���ݒ肳��Ă��܂���B");
        }
        if (input.getAttr7() == null) {
            throw new IllegalArgumentException("BlancoAntTaskSampleBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̕K�{�t�B�[���h�l[attr7]�ɒl���ݒ肳��Ă��܂���B");
        }
    }
}
