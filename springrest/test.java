class parent{
    void showm(){
        System.out.println("heklo from parent");
    }
}
class  child extends  parent{
    void dispaly(){
        System.out.println("hello from child");
    }
}
public   class test{
    public static void main(String[] args) {
        child child=new child();
        child.dispaly();
        child.showm();
    }
}
