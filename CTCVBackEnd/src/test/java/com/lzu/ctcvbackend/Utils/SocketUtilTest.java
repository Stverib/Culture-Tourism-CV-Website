package com.lzu.ctcvbackend.Utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SocketUtilTest {
    @Test
    public void testSendMessage() {
        // 假设Python服务端已启动并监听50007端口
        String message = "测试消息";
        String response = SocketUtil.sendMessage(message);
        // 这里可以根据你的Python服务端返回内容进行断言
        assertNotNull(response, "响应不应为null");
        // 可选：assertEquals("处理结果", response);
    }
} 