

public class Client {

    public static void main(String[] args) {

        /** 클라이언트가 인터페이스 타입으로 프록시를 쓰게된다. 내부에서 리얼서브젝트를 참조하고 있고. **/
        PatternInterface patternInterface = new Proxy(new RealSubject());   // 대입 연산자 우측은 스프링 DI로 제거됨.
        patternInterface.getContents();


    }

}
