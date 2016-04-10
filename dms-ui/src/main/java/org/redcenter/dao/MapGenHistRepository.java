package org.redcenter.dao;

import java.util.List;

import org.redcenter.entity.MapGenHist;
import org.redcenter.entity.MapGenHistPK;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import java.util.Date;

@RepositoryRestResource(collectionResourceRel = "mapGenHist", path = "mapGenHist")
public interface MapGenHistRepository extends PagingAndSortingRepository<MapGenHist, MapGenHistPK> {

	List<MapGenHist> findByWaferIdAndSortNo(@Param("waferId") String waferId, @Param("sortNo") String sortNo);

	List<MapGenHist> findByWaferIdAndClaimTimeBetween(@Param("waferId") String waferId,
			@Param("from") @DateTimeFormat(iso = ISO.DATE) Date from,
			@Param("to") @DateTimeFormat(iso = ISO.DATE) Date to);
}