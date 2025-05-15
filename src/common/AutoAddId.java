package common;

import enity.BenhAn;

import service.BenhAnService;
import service.IBenhAnService;


public class AutoAddId {
    public static int updateId() {
        IBenhAnService<BenhAn> benhAnService = new BenhAnService();
        int maxId = 1;
        for (BenhAn benhAn : benhAnService.getAll()) {
            if (maxId < benhAn.getId()) {
                maxId = benhAn.getId();
            }
        }
        return maxId + 1;
    }
}
