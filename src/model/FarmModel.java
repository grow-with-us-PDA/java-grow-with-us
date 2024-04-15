package model;

import java.util.Collection;
import java.util.HashMap;

public class FarmModel {
    HashMap<Integer, CropModel> farm;

    public FarmModel() {
        farm = new HashMap<>();
        System.out.println("farm 초기화");
    }

    public void setCropAtFarm(int location, CropModel crop) { // location(0~8)에 crop 심기
        if (farm.containsKey(location)) {
            System.out.println("이미 작물이 있습니다.");
        } else {
            System.out.println("작물 심기 완료");
            farm.put(location, crop);
        }
    }

    public void removeCropAtFarm(int location) { // 해당 location에 crop 삭제
        if (farm.containsKey(location)) {
            System.out.println("작물 삭제 완료");
            farm.remove(location);
        } else {
            System.out.println("해당 작물이 없습니다.");
        }
    }

    public HashMap<Integer, CropModel> getFarm() { // 현재 farm 상태 반환
        return this.farm;
    }

    public static <K, V> K getKeyFromValue(HashMap<K, V> map, V value) {
        for (HashMap.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
