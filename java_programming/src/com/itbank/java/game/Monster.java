package com.itbank.java.game;
// ���� ��Ű�� �������� ���� ������ �������̽� ����
interface Monster {
	public void getHealth();		// ��ȸ�� �Լ��� get�� ���� �����
	public void doEvolve();
	public int changeHealth(boolean isWin);
}
