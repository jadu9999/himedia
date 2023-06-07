package p427;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		
		void wake() {
			System.out.println("6시에 일어납니다.");
		work();
	}

};

void method1() {
	Person localVar = new Person() {
		void wake() {
			System.out.println("7시에 일어납니다.");
			wake();
		}
	};
	localVar.wake();
}
void method2(Person person) {
	person.wake();
	
}
}
