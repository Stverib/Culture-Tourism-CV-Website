import socket

HOST = '0.0.0.0'
PORT = 50007

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.bind((HOST, PORT))
    s.listen(1)
    print('等待连接...')
    conn, addr = s.accept()
    with conn:
        print('连接来自', addr)
        while True:
            data = conn.recv(1024) # 接收数据
            if not data:
                break
            print('收到:', data.decode())
            # 这里可以调用你的模型处理逻辑
            result = '处理结果'
            conn.sendall(result.encode()) # 发送结果