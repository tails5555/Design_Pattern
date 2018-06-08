package net.kang.adapter;

public class MetropolitanBusDevice implements TeaBusCard {
    @Override
    public void checkTea(){
        System.out.println("Tea 카드 - 체크되었습니다.");
    }
    @Override
    public void balance(int paid){
        System.out.println(String.format("Tea 카드 - %d원이 차감되었습니다.", paid));
    }
}
