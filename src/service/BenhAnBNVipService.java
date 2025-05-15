package service;

import enity.BanhAnBNVip;
import repository.BenhAnBNVipRepository;
import repository.IBenhAnBNVipRepository;

import java.util.List;

public class BenhAnBNVipService implements IBenhAnBNVipService {
    private static final IBenhAnBNVipRepository benhAnBNVipRepository = new BenhAnBNVipRepository();

    @Override
    public void add(BanhAnBNVip banhAnBNVip) {
        benhAnBNVipRepository.add(banhAnBNVip);
    }

    @Override
    public void delete(String maBenhAn) {
        benhAnBNVipRepository.delete(maBenhAn);
    }

    @Override
    public List<BanhAnBNVip> getAll() {
        return benhAnBNVipRepository.getAll();
    }
}
