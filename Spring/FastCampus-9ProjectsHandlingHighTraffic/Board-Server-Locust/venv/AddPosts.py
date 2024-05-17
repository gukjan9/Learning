from locust import HttpUser, task, between
import random

class AddPosts(HttpUser):
    waite_time = between(1, 2)  # 잠시 여유를 줌

    def on_start(self):
        self.client.post("/users/sign-in", json = {"userId": "test2",
                                                   "password": "1234"})

    @task
    def add_post(self):
        self.client.post("/posts", json = {
            "name": "테스트 게시글" + str(random.randint(1, 100000)),
            "contents": "테스트 컨텐츠" + str(random.randint(1, 100000)),
            "categoryId": random.randint(1, 10),
            "fileId": random.randint(1, 10)
        })