package service;

import java.util.List;

public interface IBenhAnService<T> {
    void add(T t);

    void delete(String maBenhAn);

    List<T> getAll();
}
