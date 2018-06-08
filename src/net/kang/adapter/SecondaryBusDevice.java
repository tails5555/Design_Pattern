package net.kang.adapter;

public class SecondaryBusDevice implements BeeBusCard{
    @Override
    public void checkBee(){
        System.out.println("Bee 카드 - 체크되었습니다.");
    }
    @Override
    public void balance(int paid){
        System.out.println(String.format("Bee 카드 - %d원이 차감되었습니다.", paid));
    }
}
