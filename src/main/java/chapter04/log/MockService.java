package chapter04.log;

import org.springframework.stereotype.Service;

@Service
public class MockService {
    @AccessLog
    public String mockMethodOne(int index) {
        return index + "MockService.mockMethodOne";
    }

    @AccessLog(recordLog = false)
    public String mockMethodTwo(int index) {
        return index + "MockService.mockMethodTwo";
    }
}
