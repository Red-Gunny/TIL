
public class Proxy implements PatternInterface {

    /** Proxy가 RealSubject를 갖고 있어야 함. **/
    RealSubject realSubject = new RealSubject();

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void getContents() {
        System.out.println("This is Proxy Class  - Before ");       /**  RealSubject 앞 뒤로 부가적인 기능을 추가할 수 있다. **/
        realSubject.getContents();
        System.out.println("This is Proxy Class  - After ");         /**  RealSubject 앞 뒤로 부가적인 기능을 추가할 수 있다. **/
    }

}
