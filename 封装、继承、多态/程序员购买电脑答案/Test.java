package T4;


public class Test {
	public static void main(String[] args) {
		//Hardware h=new Hardware();
		Geforce h1=new Geforce("TCL",1500,"2048x1536");
		Ati h2=new Ati("������",2300,"2560x1600");
		Computer c=new Computer();
		//�����
		Test t=new Test();
		t.buyComputer(c);
		//���Կ�ʼ����
		c.work();
		c.play();
		//��һ�λ��Կ�---Geforce�Ƶ��Կ�
		t.buy(h1);
		c.setH(h1);
		t.showResolution(h1);
		h1.getRendering();
		c.work();
		c.play();
        //�ڶ��λ��Կ�---Ati�Ƶ��Կ�
		t.buy(h2);
		c.setH(h2);
		t.showResolution(h2);
		h2.getRendering();
		c.work();
		c.play();
	}
	public void buyComputer(Computer c){
		System.out.println("������"+c.getBrand()+"����,����"+c.getPrice()+"Ԫ");
	}
	public void useHardware(Geforce h){
		h.getRendering();
	}
	public void buy(Geforce h){
		System.out.println("����"+h.getPrice()+"Ԫ����"+h.getBrand()+"�ƵĶ����Կ�");
	}
	public void useHardware(Ati h){
		h.getRendering();
	}
	public void buy(Ati h){
		System.out.println("����"+h.getPrice()+"Ԫ����"+h.getBrand()+"�ƵĶ����Կ�");
	}
	public void showResolution(Geforce h){
		System.out.println("�Կ��ֱ���"+h.getResolution());
	}
	public void showResolution(Ati h){
		System.out.println("�Կ��ֱ���"+h.getResolution());
	}

}
