package repository;

import java.util.List;

public interface IBenhAnRepository<T> {
    void add(T t);

    void delete(String maBenhAn);

    List<T> getAll();
}
