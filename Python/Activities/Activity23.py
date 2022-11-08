import pytest

@pytest.fixture
def inputlist():
    inputlist = [1,2,3,4,5,6,7,8,9,10]

    return inputlist

def test_sum(inputlist):
    sum = 0
    for num in inputlist:
        sum+=num
    
    assert sum == 55