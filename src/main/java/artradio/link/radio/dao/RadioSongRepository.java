package artradio.link.radio.dao;

import artradio.link.radio.entity.RadioSong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource
public interface RadioSongRepository extends JpaRepository<RadioSong, Long> {

    Page<RadioSong> findByRadioName(@RequestParam("radio") String radio, Pageable pageable);
}

