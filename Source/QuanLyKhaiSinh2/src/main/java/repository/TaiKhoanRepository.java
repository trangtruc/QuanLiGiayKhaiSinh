package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.TaiKhoan;

public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, Long>{
	TaiKhoan findByUsername(String username);
}
