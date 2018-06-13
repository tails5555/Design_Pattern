package net.kang.adapter.client;

import net.kang.adapter.bus_card_adapter.BeeBusCardAdapter;
import net.kang.adapter.bus_card_interface.TeaBusCard;
import net.kang.adapter.bus_device.MetropolitanBusDevice;
import net.kang.adapter.bus_device.SecondaryBusDevice;

public class MainClient {
    public static void main(String[] args){
        MetropolitanBusDevice mbd = new MetropolitanBusDevice();
        SecondaryBusDevice sbd = new SecondaryBusDevice();

        System.out.println("수도권 버스 디바이스에서 Tea 버스 카드로 찍습니다.");
        mbd.checkTea();
        mbd.balance(1250);

        System.out.println("지방 버스 디바이스에서 Bee 버스 카드로 찍습니다.");
        sbd.checkBee();
        sbd.balance(1300);

        TeaBusCard cardAdapter = new BeeBusCardAdapter(sbd);

        System.out.println("지방 버스 디바이스에서 Tea 버스 카드로 찍습니다.");
        cardAdapter.checkTea();
        cardAdapter.balance(1300);
    }
}
