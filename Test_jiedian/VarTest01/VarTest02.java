public class VarTest02{
	static int k =5;
	static int m = 55;
	
	public static void main(String[] args){
		int i;//��û�г�ʼ�����ڸ�ֵ�����ʼ��
		i = 100;
		System.out.println(i);
		i = 200;
		System.out.println(i);
		System.out.println(k);//���Է���
		int m = 50;
		System.out.println(m);//�ͽ�����k=50
		for(int a=0;a<10;a++){
			
		}
		//���˴����žͲ��ǵ�
		//System.out.println(i);//�޷�����a������ѭ������a�����ռ��ͷ�
	}
	public static void dosome(){
		//System.out.println(i);//�޷����룬����
		System.out.println(k);//���Ա��룬����û�����
	}
}