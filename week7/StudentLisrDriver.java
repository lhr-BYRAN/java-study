package week7;

public class StudentLisrDriver {
	public static void main(String[] args) {
		StudentList list =new StudentList(10);
		
		if(list.add(new Student("101","Tom"))) {
			System.out.println("��ӳɹ�!");
		}else {
			System.out.println("���ʧ��!");
		}
		
		if(list.add(new Student("102","Jerry"))) {
			System.out.println("��ӳɹ�!");
		}else {
			System.out.println("���ʧ��!");
		}
		
		if(list.add(new Student("103","Sam"))) {
			System.out.println("��ӳɹ�!");
		}else {
			System.out.println("���ʧ��!");
		}
		
		System.out.println("����ѧ��Ϊ102��ѧ����Ϣ:");
		int index=list.indexof("102");
		if(index!=-1) {
			System.out.println(list.get(index).toString());
		}else {			
			System.out.println("û���ҵ�!");
		}
		
		
		System.out.println("��ӡ����:");
		System.out.println(list.toString());
		
		
		System.out.println("ɾ��λ��Ϊ5��Ԫ��:");
		if(list.remove(5)) {
			System.out.println("ɾ���ɹ�");
			System.out.println("ɾ���󼯺�Ϊ:");
			System.out.println(list.toString());
		}else {
			System.out.println("������ֻ��"+list.getCount()+"��Ԫ��");
			System.out.println("ɾ��ʧ��"+"\n");
		}
		
		System.out.println("ɾ��λ��Ϊ2��Ԫ��:");
		if(list.remove(2)) {
			System.out.println("ɾ���ɹ�");
			System.out.println("ɾ���󼯺�Ϊ:");
			System.out.println(list.toString());
		}else {
			System.out.println("������ֻ��"+list.getCount()+"��Ԫ��");
			System.out.println("ɾ��ʧ��"+"\n");
		}
		
		System.out.println("ɾ��λ��Ϊ3��Ԫ��:");
		if(list.remove(3)) {
			System.out.println("ɾ���ɹ�");
			System.out.println("ɾ���󼯺�Ϊ:");
			System.out.println(list.toString());
		}else {
			System.out.println("������ֻ��"+list.getCount()+"��Ԫ��");
			System.out.println("ɾ��ʧ��"+"\n");
		}
		
	}
}
