package service;

import enity.BenhAnBNThuong;
import repository.BenhAnBNThuongRepository;
import repository.IBenhAnBNThuongRepository;
import java.util.List;

public class BenhAnBNThuongService implements IBenhAnBNThuongService {
    private static final IBenhAnBNThuongRepository benhAnBNThuongRepository = new BenhAnBNThuongRepository();

    @Override
    public void add(BenhAnBNThuong benhAnBNThuong) {
        benhAnBNThuongRepository.add(benhAnBNThuong);
    }

    @Override
    public void delete(String maBenhAn) {
        benhAnBNThuongRepository.delete(maBenhAn);
    }

    @Override
    public List<BenhAnBNThuong> getAll() {
        return benhAnBNThuongRepository.getAll();
    }
}
