package T4;

public class Computer {
	private String brand="����";
	private int price=5000;
	//private Hardware h=new Hardware();
	string morenxianka = jichengxianka;
	Geforce g;
	Ati a;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

	public Computer(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void play (){
		if(h.getName()==""){
			System.out.println("��lol,һ·������ͭ5");
			System.out.println("�����������˻���,��ʼ��������");
			System.out.println("------------����������-----------");
		}
		if(h.getName()=="Geforce"){
			System.out.println("��Ϸ����������������,����������ˬ");
			System.out.println("------------����������-----------");
		}
		if(h.getName()=="Ati"){
			System.out.println("һ�ٲ���,�������ϴ�ʦ��");
		}				
	}
	public void work (){
		if(h.getName()==""){
			System.out.println("����ʹ��ԭװ�����ô���,ͻȻ����");
		}
		if(h.getName()=="Geforce"){
			System.out.println("������Geforce�����Կ�,����"+h.getPrice()+"Ԫ,��Ȼ����,����������");
		}
		if(h.getName()=="Ati"){
			System.out.println("������Ati�����Կ�,����"+h.getPrice()+"Ԫ,��һ��ĸо�,��һ����������,�о��Լ�Ҫ����");
		}				
	}
}
