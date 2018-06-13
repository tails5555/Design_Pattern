package net.kang.facade.client;

import net.kang.facade.enumeration.RegionType;
import net.kang.facade.facade_object.SingerFacade;

import java.util.Arrays;

public class MainClient {
    public static void main(String[] args){
        System.out.println("[가수 Dok2가 콘서트를 진행합니다.]");

        SingerFacade dok2 = new SingerFacade(Arrays.asList(RegionType.SEOUL, RegionType.DAEJEON, RegionType.GWANGJU, RegionType.BUSAN));
        dok2.addScheduleSeoulConcert("Dok2 With Jay Park", "1llionaire, AOMG");
        dok2.addScheduleDaejeonConcert("Young King Young Boss", "Adidas");
        dok2.addScheduleGwangjuConcert("Dok2 Gwangju Come Back", "Rolex");
        dok2.addScheduleBusanConcert("Hometown Comin' Back", "부산광역시청");

        dok2.startConcert("Dok2 앨범 새로 나왔으니 털ㄴ업~");
        System.out.println();

        System.out.println("[가수 The Quiett가 콘서트를 진행합니다.]");

        SingerFacade theQuiett = new SingerFacade(Arrays.asList(RegionType.SEOUL, RegionType.INCHEON, RegionType.DAEGU, RegionType.GWANGJU));
        theQuiett.addScheduleSeoulConcert("Beverly 1lls With Seoul", "서울특별시청");
        theQuiett.addScheduleIncheonConcert("International Rap Battle", "Adidas");
        theQuiett.addScheduleDaeguConcert("Prima Vista With Quiett", "1llionaire");
        theQuiett.addScheduleGwangjuConcert("The Quiett Come Back", "1llionaire, AMBITION");

        theQuiett.startConcert("신곡 아직 안 나왔어요~");
        System.out.println();
    }
}
