/*
 * blanco Framework
 * Copyright (C) 2004-2009 IGA Tosiki
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.sample.task.valueobject;

import java.math.BigDecimal;

/**
 * �����N���X [BlancoAntTaskSampleProcess]�̓��̓o�����[�I�u�W�F�N�g�N���X�ł��B
 */
public class BlancoAntTaskSampleProcessInput {
    /**
     * verbose���[�h�œ��삳���邩�ǂ����B
     *
     * �t�B�[���h: [verbose]�B
     * �f�t�H���g: [false]�B
     */
    private boolean fVerbose = false;

    /**
     * ������i�K�{�j
     *
     * �t�B�[���h: [attr1]�B
     */
    private String fAttr1;

    /**
     * blanco:string
     *
     * �t�B�[���h: [attr2]�B
     * �f�t�H���g: [�f�t�H���g]�B
     */
    private String fAttr2 = "�f�t�H���g";

    /**
     * ����(int)(�K�{)
     *
     * �t�B�[���h: [attr3]�B
     */
    private int fAttr3;

    /**
     * blanco:int
     *
     * �t�B�[���h: [attr4]�B
     * �f�t�H���g: [10]�B
     */
    private int fAttr4 = 10;

    /**
     * ����(long)(�K�{)
     *
     * �t�B�[���h: [attr5]�B
     */
    private long fAttr5;

    /**
     * blanco:long
     *
     * �t�B�[���h: [attr6]�B
     * �f�t�H���g: [100]�B
     */
    private long fAttr6 = 100;

    /**
     * ����(decimal)(�K�{)
     *
     * �t�B�[���h: [attr7]�B
     */
    private BigDecimal fAttr7;

    /**
     * ����(decimal)
     *
     * �t�B�[���h: [attr8]�B
     * �f�t�H���g: [123.456]�B
     */
    private BigDecimal fAttr8 = new BigDecimal("123.456");

    /**
     * �^�U(�K�{)
     *
     * �t�B�[���h: [attr9]�B
     */
    private boolean fAttr9;

    /**
     * blanco:boolean
     *
     * �t�B�[���h: [attr10]�B
     * �f�t�H���g: [true]�B
     */
    private boolean fAttr10 = true;

    /**
     * �t�B�[���h [verbose] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [verbose���[�h�œ��삳���邩�ǂ����B]�B
     *
     * @param argVerbose �t�B�[���h[verbose]�ɐݒ肷��l�B
     */
    public void setVerbose(final boolean argVerbose) {
        fVerbose = argVerbose;
    }

    /**
     * �t�B�[���h [verbose] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [verbose���[�h�œ��삳���邩�ǂ����B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[verbose]����擾�����l�B
     */
    public boolean getVerbose() {
        return fVerbose;
    }

    /**
     * �t�B�[���h [attr1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [������i�K�{�j]�B
     *
     * @param argAttr1 �t�B�[���h[attr1]�ɐݒ肷��l�B
     */
    public void setAttr1(final String argAttr1) {
        fAttr1 = argAttr1;
    }

    /**
     * �t�B�[���h [attr1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [������i�K�{�j]�B
     *
     * @return �t�B�[���h[attr1]����擾�����l�B
     */
    public String getAttr1() {
        return fAttr1;
    }

    /**
     * �t�B�[���h [attr2] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [blanco:string]�B
     *
     * @param argAttr2 �t�B�[���h[attr2]�ɐݒ肷��l�B
     */
    public void setAttr2(final String argAttr2) {
        fAttr2 = argAttr2;
    }

    /**
     * �t�B�[���h [attr2] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [blanco:string]�B
     * �f�t�H���g: [�f�t�H���g]�B
     *
     * @return �t�B�[���h[attr2]����擾�����l�B
     */
    public String getAttr2() {
        return fAttr2;
    }

    /**
     * �t�B�[���h [attr3] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [����(int)(�K�{)]�B
     *
     * @param argAttr3 �t�B�[���h[attr3]�ɐݒ肷��l�B
     */
    public void setAttr3(final int argAttr3) {
        fAttr3 = argAttr3;
    }

    /**
     * �t�B�[���h [attr3] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [����(int)(�K�{)]�B
     *
     * @return �t�B�[���h[attr3]����擾�����l�B
     */
    public int getAttr3() {
        return fAttr3;
    }

    /**
     * �t�B�[���h [attr4] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [blanco:int]�B
     *
     * @param argAttr4 �t�B�[���h[attr4]�ɐݒ肷��l�B
     */
    public void setAttr4(final int argAttr4) {
        fAttr4 = argAttr4;
    }

    /**
     * �t�B�[���h [attr4] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [blanco:int]�B
     * �f�t�H���g: [10]�B
     *
     * @return �t�B�[���h[attr4]����擾�����l�B
     */
    public int getAttr4() {
        return fAttr4;
    }

    /**
     * �t�B�[���h [attr5] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [����(long)(�K�{)]�B
     *
     * @param argAttr5 �t�B�[���h[attr5]�ɐݒ肷��l�B
     */
    public void setAttr5(final long argAttr5) {
        fAttr5 = argAttr5;
    }

    /**
     * �t�B�[���h [attr5] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [����(long)(�K�{)]�B
     *
     * @return �t�B�[���h[attr5]����擾�����l�B
     */
    public long getAttr5() {
        return fAttr5;
    }

    /**
     * �t�B�[���h [attr6] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [blanco:long]�B
     *
     * @param argAttr6 �t�B�[���h[attr6]�ɐݒ肷��l�B
     */
    public void setAttr6(final long argAttr6) {
        fAttr6 = argAttr6;
    }

    /**
     * �t�B�[���h [attr6] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [blanco:long]�B
     * �f�t�H���g: [100]�B
     *
     * @return �t�B�[���h[attr6]����擾�����l�B
     */
    public long getAttr6() {
        return fAttr6;
    }

    /**
     * �t�B�[���h [attr7] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [����(decimal)(�K�{)]�B
     *
     * @param argAttr7 �t�B�[���h[attr7]�ɐݒ肷��l�B
     */
    public void setAttr7(final BigDecimal argAttr7) {
        fAttr7 = argAttr7;
    }

    /**
     * �t�B�[���h [attr7] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [����(decimal)(�K�{)]�B
     *
     * @return �t�B�[���h[attr7]����擾�����l�B
     */
    public BigDecimal getAttr7() {
        return fAttr7;
    }

    /**
     * �t�B�[���h [attr8] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [����(decimal)]�B
     *
     * @param argAttr8 �t�B�[���h[attr8]�ɐݒ肷��l�B
     */
    public void setAttr8(final BigDecimal argAttr8) {
        fAttr8 = argAttr8;
    }

    /**
     * �t�B�[���h [attr8] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [����(decimal)]�B
     * �f�t�H���g: [123.456]�B
     *
     * @return �t�B�[���h[attr8]����擾�����l�B
     */
    public BigDecimal getAttr8() {
        return fAttr8;
    }

    /**
     * �t�B�[���h [attr9] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�^�U(�K�{)]�B
     *
     * @param argAttr9 �t�B�[���h[attr9]�ɐݒ肷��l�B
     */
    public void setAttr9(final boolean argAttr9) {
        fAttr9 = argAttr9;
    }

    /**
     * �t�B�[���h [attr9] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�^�U(�K�{)]�B
     *
     * @return �t�B�[���h[attr9]����擾�����l�B
     */
    public boolean getAttr9() {
        return fAttr9;
    }

    /**
     * �t�B�[���h [attr10] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [blanco:boolean]�B
     *
     * @param argAttr10 �t�B�[���h[attr10]�ɐݒ肷��l�B
     */
    public void setAttr10(final boolean argAttr10) {
        fAttr10 = argAttr10;
    }

    /**
     * �t�B�[���h [attr10] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [blanco:boolean]�B
     * �f�t�H���g: [true]�B
     *
     * @return �t�B�[���h[attr10]����擾�����l�B
     */
    public boolean getAttr10() {
        return fAttr10;
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
        buf.append("blanco.sample.task.valueobject.BlancoAntTaskSampleProcessInput[");
        buf.append("verbose=" + fVerbose);
        buf.append(",attr1=" + fAttr1);
        buf.append(",attr2=" + fAttr2);
        buf.append(",attr3=" + fAttr3);
        buf.append(",attr4=" + fAttr4);
        buf.append(",attr5=" + fAttr5);
        buf.append(",attr6=" + fAttr6);
        buf.append(",attr7=" + fAttr7);
        buf.append(",attr8=" + fAttr8);
        buf.append(",attr9=" + fAttr9);
        buf.append(",attr10=" + fAttr10);
        buf.append("]");
        return buf.toString();
    }
}
