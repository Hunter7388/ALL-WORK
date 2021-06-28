package Generics;

//class data{
//	private object obj;
//
//	public data(object obj) {
//		this.obj = obj;
//	}
//
//	public object getObj() {
//		return obj;
//	}
//
//	public void setObj(object obj) {
//		this.obj = obj;
//	}
//	
//}

class GenericClass<T> {
	private T data;

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}


	
}

public class App {

	public static void main(String[] args) {
    GenericClass<String> genericData =new  GenericClass<String>("some Data");
    String data =genericData.getData();
    System.out.println(data);
	}

}
