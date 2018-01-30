package com.gulsah.project.microservice.forex.springbootmicroserviceforex;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GulsahCoskun on 30.01.2018.
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {

    ExchangeValue findByFromAndTo(String from,String to);
}
