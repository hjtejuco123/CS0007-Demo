
class Tesla extends Vehicle implements Electric{
    
    Tesla(String brand) {
        super(brand);
    }
    
    void honk(){
        System.out.println(brand +"says beep beep");
    }
    
    public void charge(){
        System.out.println(brand +"charging");
        
    }
}
