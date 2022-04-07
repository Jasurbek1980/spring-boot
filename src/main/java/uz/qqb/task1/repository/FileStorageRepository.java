package uz.qqb.task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.qqb.task1.domain.FileStorage;
import uz.qqb.task1.domain.FileStorageStatus;

import java.util.List;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage,Long> {

    FileStorage findByHashId(String hashId);

    List <FileStorage> findAllByFileStorageStatus(FileStorageStatus status);
}
