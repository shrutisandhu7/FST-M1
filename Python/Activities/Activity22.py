import pytest

@pytest.mark.activity
def testsum():
   a = 10
   b = 5
   assert (a+b) == 15

@pytest.mark.activity
def testdifference():
   a = 10
   b = 5
   assert (a-b) == 5

def testproduct():
   a = 10
   b = 5
   assert (a*b) == 50


def testquotient():
   a = 10
   b = 5
   assert (a/b) == 2
