package net.kang.adapter;

public class BeeBusCardAdapter implements TeaBusCard{
    BeeBusCard beeBusCard;

    public BeeBusCardAdapter(BeeBusCard beeBusCard){
        this.beeBusCard = beeBusCard;
    }

    @Override
    public void checkTea(){
        System.out.println("[Tea 카드 체계에서 Bee 카드 체계로 바뀝니다.]");
        this.beeBusCard.checkBee();
    }

    @Override
    public void balance(int paid){
        System.out.println("[Tea 카드 체계에서 Bee 카드 체계로 바뀝니다.]");
        this.beeBusCard.balance(paid);
    }
}
