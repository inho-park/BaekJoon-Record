package generic;

import java.util.Comparator;

public class MyMath {
	public static <T extends Number> double getAverage(T [] array) {
		double result=0.0;
		for (int i=0;i<array.length;i++) result+=Double.parseDouble(array[i]+"");
		result=result/array.length;
		return result;
	}
	
	public static void main(String[] args) {
		// Example of using getAverage in MyMath class
		Integer ArrOne [] = {1,2,3,4,5};
		Double ArrTwo [] = {11.1,22.2,33.3,44.4,55.5};
		Long ArrThr [] = {7l,8l,9l,10l,11l};
		System.out.println(getAverage(ArrOne));
		System.out.println(getAverage(ArrTwo));
		System.out.println(getAverage(ArrThr));
		
		// Example of using class what is implemented Comparable
		Student s1 = new Student(15,3);
		Student s2 = new Student(16,2);
		System.out.println("s1.compareTo(s2) : "+s1.compareTo(s2));
		
		// Example of using class what is implemented Comparator
		YourMath y1 = new YourMath(3);
		YourMath y2 = new YourMath(5);
		YourMath y3 = new YourMath(2);
		System.out.println("y1.compare(y2,y3) : "+y1.compare(y2, y3)); // y1 과 상관없이 y2 와 y3 비교
		
		
		System.out.println("Long.MAX_VALUE : "+Long.MAX_VALUE);
		
	}
}

class Student implements Comparable<Student> {
	int age;
	int classNumber;
	Student (int age,int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.age > o.age) return 1; 
		else if (this.age == o.age) return 0;
		else return -1;
	}
}

class YourMath implements Comparator<YourMath>{
	private int order;
	YourMath(int order) {
		this.order = order;
	}
	public <T extends Number> float getAverage(T [] arr) {
		float result =0.0f;
		for (int i=0;i<arr.length;i++) result+=Float.parseFloat(arr[i]+"");
		result/=arr.length;
		return result;		
	}
	
	@Override
	public int compare(YourMath o1, YourMath o2) {
		// TODO Auto-generated method stub
		if (o1.order>o2.order) return 1;
		else if (o1.order==o2.order) return 0;
		else return -1;
	}
}