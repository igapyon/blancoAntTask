/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
package blanco.anttask.message;

/**
 * blancoAntTask�̃��b�Z�[�W�N���X�B�v���O�������ŗ��p����郁�b�Z�[�W���i�[���܂��B
 */
public class BlancoAntTaskMessage {
    /**
     * ���b�Z�[�W���v���p�e�B�t�@�C���Ή������邽�߂̓����I�ɗ��p���郊�\�[�X�o���h���N���X�B
     */
    protected final BlancoAntTaskMessageResourceBundle fBundle = new BlancoAntTaskMessageResourceBundle();

    /**
     * ���b�Z�[�W��`ID[BlancoAntTask]�A�L�[[MBATI001]�̕�������擾���܂��B
     *
     * No.2:
     * ������[�^�X�N��[{0}]�A�A�g���r���[�g[{1}]�ɂ����āA[�K�{]��[�f�t�H���g]�������Ɏw�肳��Ă��܂��B������[�K�{]��[�f�t�H���g]�͔r���I�ɁA�����������ꂩ�͎w�肷��K�v������܂��B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @param arg1 �u��������{1}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbati001(final String arg0, final String arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbati001]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }
        if (arg1 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbati001]�̃p�����[�^[arg1]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBATI001] " + fBundle.getMbati001(arg0, arg1);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoAntTask]�A�L�[[MBATA001]�̕�������擾���܂��B
     *
     * No.5:
     * ������[���^�f�B���N�g��[{0}]�����݂��܂���B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbata001(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbata001]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBATA001] " + fBundle.getMbata001(arg0);
    }

    /**
     * ���b�Z�[�W��`ID[BlancoAntTask]�A�L�[[MBATA002]�̕�������擾���܂��B
     *
     * No.6:
     * ������[���^�f�B���N�g��[{0}]�̃t�@�C���ꗗ�擾�����Ɏ��s���܂����B]
     *
     * @param arg0 �u��������{0}�̒l�B
     * @return ���b�Z�[�W������B
     */
    public String getMbata002(final String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("���\�b�h[getMbata002]�̃p�����[�^[arg0]��null���^�����܂����B�������A���̃p�����[�^��null��^���邱�Ƃ͂ł��܂���B");
        }

        return "[MBATA002] " + fBundle.getMbata002(arg0);
    }
}
