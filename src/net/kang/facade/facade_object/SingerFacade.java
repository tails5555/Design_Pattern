package net.kang.facade.facade_object;

import net.kang.facade.enumeration.RegionType;
import net.kang.facade.gyeongsang_region.BusanConcert;
import net.kang.facade.gyeongsang_region.DaeguConcert;
import net.kang.facade.chungcheong_region.DaejeonConcert;
import net.kang.facade.jeonra_region.GwangjuConcert;
import net.kang.facade.metropolitan_region.IncheonConcert;
import net.kang.facade.metropolitan_region.SeoulConcert;

import java.util.List;

public class SingerFacade {
    private SeoulConcert seoulConcert;
    private IncheonConcert incheonConcert;
    private DaejeonConcert daejeonConcert;
    private DaeguConcert daeguConcert;
    private GwangjuConcert gwangjuConcert;
    private BusanConcert busanConcert;

    public SingerFacade(List<RegionType> regionList){
        for(RegionType regionType : regionList){
            switch(regionType){
                case SEOUL :
                    this.seoulConcert = new SeoulConcert();
                    break;
                case INCHEON :
                    this.incheonConcert = new IncheonConcert();
                    break;
                case DAEJEON :
                    this.daejeonConcert = new DaejeonConcert();
                    break;
                case DAEGU :
                    this.daeguConcert = new DaeguConcert();
                    break;
                case GWANGJU :
                    this.gwangjuConcert = new GwangjuConcert();
                    break;
                case BUSAN :
                    this.busanConcert = new BusanConcert();
                    break;
            }
        }
    }

    public void addScheduleSeoulConcert(String title, String support){
        if(this.seoulConcert != null){
            this.seoulConcert.addSchedule(title, support);
        }else{
            System.out.println("[서울 콘서트 계획은 없습니다.]");
        }
    }

    public void addScheduleIncheonConcert(String title, String support){
        if(this.incheonConcert != null){
            this.incheonConcert.addSchedule(title, support);
        }else{
            System.out.println("[인천 콘서트 계획은 없습니다.]");
        }
    }

    public void addScheduleDaejeonConcert(String title, String support){
        if(this.daejeonConcert != null){
            this.daejeonConcert.addSchedule(title, support);
        }else{
            System.out.println("[대전 콘서트 계획은 없습니다.]");
        }
    }

    public void addScheduleDaeguConcert(String title, String support){
        if(this.daeguConcert != null){
            this.daeguConcert.addSchedule(title, support);
        }else{
            System.out.println("[대구 콘서트 계획은 없습니다.]");
        }
    }

    public void addScheduleGwangjuConcert(String title, String support){
        if(this.gwangjuConcert != null){
            this.gwangjuConcert.addSchedule(title, support);
        }else{
            System.out.println("[광주 콘서트 계획은 없습니다.]");
        }
    }

    public void addScheduleBusanConcert(String title, String support){
        if(this.busanConcert != null){
            this.busanConcert.addSchedule(title, support);
        }else{
            System.out.println("[부산 콘서트 계획은 없습니다.]");
        }
    }

    public void startConcert(String advContext){
        if(this.seoulConcert != null){
            this.seoulConcert.concertStart();
            this.seoulConcert.advertise(advContext);
            this.seoulConcert.concertEnd();
        }

        if(this.incheonConcert != null){
            this.incheonConcert.concertStart();
            this.incheonConcert.concertEnd();
        }

        if(this.daejeonConcert != null){
            this.daejeonConcert.concertStart();
            this.daejeonConcert.concertEnd();
        }

        if(this.daeguConcert != null){
            this.daeguConcert.concertStart();
            this.daeguConcert.concertEnd();
        }

        if(this.gwangjuConcert != null){
            this.gwangjuConcert.concertStart();
            this.gwangjuConcert.advertise(advContext);
            this.gwangjuConcert.concertEnd();
        }

        if(this.busanConcert != null){
            this.busanConcert.concertStart();
            this.busanConcert.advertise(advContext);
            this.busanConcert.concertEnd();
        }
    }
}
