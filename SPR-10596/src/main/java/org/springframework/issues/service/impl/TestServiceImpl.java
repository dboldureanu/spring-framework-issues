package org.springframework.issues.service.impl;

import javax.annotation.Resource;

import org.springframework.issues.dao.TestDAO;
import org.springframework.issues.datamodel.TestData;
import org.springframework.issues.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestServiceImpl implements TestService
{

  @Resource
  private TestDAO dao;

  @Override
  @Transactional
  public TestData saveTestData(TestData entity)
  {
    System.out.println("A");

    System.out.println("B");

    System.out.println("C");

    System.out.println("E");

    System.out.println("F");

    return dao.saveTestData(entity);
  }

  @Override
  @Transactional(readOnly = true)
  public TestData loadTestDataById(Long id)
  {
    System.out.println("A");

    System.out.println("B");

    System.out.println("C");

    System.out.println("E");

    System.out.println("F");

    return dao.loadTestDataById(id);
  }
}
