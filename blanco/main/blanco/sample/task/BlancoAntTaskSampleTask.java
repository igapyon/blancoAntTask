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

import java.math.BigDecimal;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import blanco.sample.task.valueobject.BlancoAntTaskSampleProcessInput;

/**
 * Apache Ant�^�X�N [BlancoAntTaskSample]�̃N���X�B
 *
 * ���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B<br>
 * ���̃N���X�ł́AApache Ant�^�X�N�ň�ʓI�ɕK�v�ȃ`�F�b�N�Ȃǂ̃R�[�f�B���O�������肵�܂��B
 * ���ۂ̏����� �p�b�P�[�W[blanco.sample.task]��BlancoAntTaskSampleBatchProcess�N���X���쐬���ċL�q���Ă��������B<br>
 * <br>
 * Ant�^�X�N�ւ̑g�ݍ��ݗ�<br>
 * <pre>
 * &lt;taskdef name=&quot;blancoanttasksample&quot; classname=&quot;blanco.sample.task.BlancoAntTaskSampleTask">
 *     &lt;classpath&gt;
 *         &lt;fileset dir=&quot;lib&quot; includes=&quot;*.jar&quot; /&gt;
 *         &lt;fileset dir=&quot;lib.ant&quot; includes=&quot;*.jar&quot; /&gt;
 *     &lt;/classpath&gt;
 * &lt;/taskdef&gt;
 * </pre>
 */
public class BlancoAntTaskSampleTask extends Task {
    /**
     * ���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B
     */
    protected BlancoAntTaskSampleProcessInput fInput = new BlancoAntTaskSampleProcessInput();

    /**
     * �t�B�[���h [attr1] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldAttr1Processed = false;

    /**
     * �t�B�[���h [attr2] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldAttr2Processed = false;

    /**
     * �t�B�[���h [attr3] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldAttr3Processed = false;

    /**
     * �t�B�[���h [attr4] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldAttr4Processed = false;

    /**
     * �t�B�[���h [attr5] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldAttr5Processed = false;

    /**
     * �t�B�[���h [attr6] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldAttr6Processed = false;

    /**
     * �t�B�[���h [attr7] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldAttr7Processed = false;

    /**
     * �t�B�[���h [attr8] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldAttr8Processed = false;

    /**
     * �t�B�[���h [attr9] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldAttr9Processed = false;

    /**
     * �t�B�[���h [attr10] �ɒl���Z�b�g���ꂽ���ǂ����B
     */
    protected boolean fIsFieldAttr10Processed = false;

    /**
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * @param arg verbose���[�h�œ��삳���邩�ǂ����B
     */
    public void setVerbose(final boolean arg) {
        fInput.setVerbose(arg);
    }

    /**
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * @return verbose���[�h�œ��삳���邩�ǂ����B
     */
    public boolean getVerbose() {
        return fInput.getVerbose();
    }

    /**
     * Ant�^�X�N��[attr1]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 1<br>
     * ������i�K�{�j<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setAttr1(final String arg) {
        fInput.setAttr1(arg);
        fIsFieldAttr1Processed = true;
    }

    /**
     * Ant�^�X�N��[attr1]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 1<br>
     * ������i�K�{�j<br>
     * �K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getAttr1() {
        return fInput.getAttr1();
    }

    /**
     * Ant�^�X�N��[attr2]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 2<br>
     * blanco:string<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setAttr2(final String arg) {
        fInput.setAttr2(arg);
        fIsFieldAttr2Processed = true;
    }

    /**
     * Ant�^�X�N��[attr2]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 2<br>
     * blanco:string<br>
     * �f�t�H���g�l[�f�t�H���g]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getAttr2() {
        return fInput.getAttr2();
    }

    /**
     * Ant�^�X�N��[attr3]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 3<br>
     * ����(int)(�K�{)<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setAttr3(final String arg) {
        try {
            fInput.setAttr3(Integer.parseInt(arg));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ant�^�X�N��[attr3]�A�g���r���[�g�ɗ^����ꂽ�l�̐��l��͂Ɏ��s���܂����B" + e.toString());
        }
        fIsFieldAttr3Processed = true;
    }

    /**
     * Ant�^�X�N��[attr3]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 3<br>
     * ����(int)(�K�{)<br>
     * �K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getAttr3() {
        return String.valueOf(fInput.getAttr3());
    }

    /**
     * Ant�^�X�N��[attr4]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 4<br>
     * blanco:int<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setAttr4(final String arg) {
        try {
            fInput.setAttr4(Integer.parseInt(arg));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ant�^�X�N��[attr4]�A�g���r���[�g�ɗ^����ꂽ�l�̐��l��͂Ɏ��s���܂����B" + e.toString());
        }
        fIsFieldAttr4Processed = true;
    }

    /**
     * Ant�^�X�N��[attr4]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 4<br>
     * blanco:int<br>
     * �f�t�H���g�l[10]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getAttr4() {
        return String.valueOf(fInput.getAttr4());
    }

    /**
     * Ant�^�X�N��[attr5]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 5<br>
     * ����(long)(�K�{)<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setAttr5(final String arg) {
        try {
            fInput.setAttr5(Long.parseLong(arg));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ant�^�X�N��[attr5]�A�g���r���[�g�ɗ^����ꂽ�l�̐��l��͂Ɏ��s���܂����B" + e.toString());
        }
        fIsFieldAttr5Processed = true;
    }

    /**
     * Ant�^�X�N��[attr5]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 5<br>
     * ����(long)(�K�{)<br>
     * �K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getAttr5() {
        return String.valueOf(fInput.getAttr5());
    }

    /**
     * Ant�^�X�N��[attr6]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 6<br>
     * blanco:long<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setAttr6(final String arg) {
        try {
            fInput.setAttr6(Long.parseLong(arg));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ant�^�X�N��[attr6]�A�g���r���[�g�ɗ^����ꂽ�l�̐��l��͂Ɏ��s���܂����B" + e.toString());
        }
        fIsFieldAttr6Processed = true;
    }

    /**
     * Ant�^�X�N��[attr6]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 6<br>
     * blanco:long<br>
     * �f�t�H���g�l[100]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getAttr6() {
        return String.valueOf(fInput.getAttr6());
    }

    /**
     * Ant�^�X�N��[attr7]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 7<br>
     * ����(decimal)(�K�{)<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setAttr7(final String arg) {
        try {
            fInput.setAttr7(new BigDecimal(arg));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ant�^�X�N��[attr7]�A�g���r���[�g�ɗ^����ꂽ�l�̐��l��͂Ɏ��s���܂����B" + e.toString());
        }
        fIsFieldAttr7Processed = true;
    }

    /**
     * Ant�^�X�N��[attr7]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 7<br>
     * ����(decimal)(�K�{)<br>
     * �K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getAttr7() {
        return fInput.getAttr7().toString();
    }

    /**
     * Ant�^�X�N��[attr8]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 8<br>
     * ����(decimal)<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setAttr8(final String arg) {
        try {
            fInput.setAttr8(new BigDecimal(arg));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ant�^�X�N��[attr8]�A�g���r���[�g�ɗ^����ꂽ�l�̐��l��͂Ɏ��s���܂����B" + e.toString());
        }
        fIsFieldAttr8Processed = true;
    }

    /**
     * Ant�^�X�N��[attr8]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 8<br>
     * ����(decimal)<br>
     * �f�t�H���g�l[123.456]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public String getAttr8() {
        return fInput.getAttr8().toString();
    }

    /**
     * Ant�^�X�N��[attr9]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 9<br>
     * �^�U(�K�{)<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setAttr9(final boolean arg) {
        fInput.setAttr9(arg);
        fIsFieldAttr9Processed = true;
    }

    /**
     * Ant�^�X�N��[attr9]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 9<br>
     * �^�U(�K�{)<br>
     * �K�{�A�g���r���[�g�ł��BApache Ant�^�X�N��ŕK���l���w�肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public boolean getAttr9() {
        return fInput.getAttr9();
    }

    /**
     * Ant�^�X�N��[attr10]�A�g���r���[�g�̃Z�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 10<br>
     * blanco:boolean<br>
     *
     * @param arg �Z�b�g�������l
     */
    public void setAttr10(final boolean arg) {
        fInput.setAttr10(arg);
        fIsFieldAttr10Processed = true;
    }

    /**
     * Ant�^�X�N��[attr10]�A�g���r���[�g�̃Q�b�^�[���\�b�h�B
     *
     * ���ڔԍ�: 10<br>
     * blanco:boolean<br>
     * �f�t�H���g�l[true]���ݒ肳��Ă��܂��BApache Ant�^�X�N��ŃA�g���r���[�g�̎w�肪�����ꍇ�ɂ́A�f�t�H���g�l���ݒ肳��܂��B<br>
     *
     * @return ���̃t�B�[���h�̒l
     */
    public boolean getAttr10() {
        return fInput.getAttr10();
    }

    /**
     * Ant�^�X�N�̃��C�������BApache Ant���� ���̃��\�b�h���Ăяo����܂��B
     *
     * @throws BuildException �^�X�N�Ƃ��Ă̗�O�����������ꍇ�B
     */
    @Override
    public final void execute() throws BuildException {
        System.out.println("BlancoAntTaskSampleTask begin.");

        // ���ڔԍ�[1]�A�A�g���r���[�g[attr1]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B
        if (fIsFieldAttr1Processed == false) {
            throw new BuildException("�K�{�A�g���r���[�g[attr1]���ݒ肳��Ă��܂���B�����𒆒f���܂��B");
        }
        // ���ڔԍ�[3]�A�A�g���r���[�g[attr3]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B
        if (fIsFieldAttr3Processed == false) {
            throw new BuildException("�K�{�A�g���r���[�g[attr3]���ݒ肳��Ă��܂���B�����𒆒f���܂��B");
        }
        // ���ڔԍ�[5]�A�A�g���r���[�g[attr5]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B
        if (fIsFieldAttr5Processed == false) {
            throw new BuildException("�K�{�A�g���r���[�g[attr5]���ݒ肳��Ă��܂���B�����𒆒f���܂��B");
        }
        // ���ڔԍ�[7]�A�A�g���r���[�g[attr7]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B
        if (fIsFieldAttr7Processed == false) {
            throw new BuildException("�K�{�A�g���r���[�g[attr7]���ݒ肳��Ă��܂���B�����𒆒f���܂��B");
        }
        // ���ڔԍ�[9]�A�A�g���r���[�g[attr9]�͕K�{���͂ł��B���̓`�F�b�N���s���܂��B
        if (fIsFieldAttr9Processed == false) {
            throw new BuildException("�K�{�A�g���r���[�g[attr9]���ݒ肳��Ă��܂���B�����𒆒f���܂��B");
        }

        if (getVerbose()) {
            System.out.println("- verbose:[true]");
            System.out.println("- attr1:[" + getAttr1() + "]");
            System.out.println("- attr2:[" + getAttr2() + "]");
            System.out.println("- attr3:[" + getAttr3() + "]");
            System.out.println("- attr4:[" + getAttr4() + "]");
            System.out.println("- attr5:[" + getAttr5() + "]");
            System.out.println("- attr6:[" + getAttr6() + "]");
            System.out.println("- attr7:[" + getAttr7() + "]");
            System.out.println("- attr8:[" + getAttr8() + "]");
            System.out.println("- attr9:[" + getAttr9() + "]");
            System.out.println("- attr10:[" + getAttr10() + "]");
        }

        try {
            // ���ۂ�Ant�^�X�N�̎又�������s���܂��B
            // ���̉ӏ��ŃR���p�C���G���[����������ꍇ�ABlancoAntTaskSampleProcess�C���^�t�F�[�X���������� blanco.sample.task�p�b�P�[�W�� BlancoAntTaskSampleProcessImpl�N���X���쐬���邱�Ƃɂ������ł���ꍇ������܂��B
            final BlancoAntTaskSampleProcess proc = new BlancoAntTaskSampleProcessImpl();
            if (proc.execute(fInput) != BlancoAntTaskSampleBatchProcess.END_SUCCESS) {
                throw new BuildException("�^�X�N�ُ͈�I�����܂����B");
            }
        } catch (IllegalArgumentException e) {
            if (getVerbose()) {
                e.printStackTrace();
            }
            throw new BuildException(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            throw new BuildException("�^�X�N���������ɗ�O���������܂����B�����𒆒f���܂��B" + e.toString());
        } catch (Error e) {
            e.printStackTrace();
            throw new BuildException("�^�X�N���������ɃG���[���������܂����B�����𒆒f���܂��B" + e.toString());
        }
    }
}
