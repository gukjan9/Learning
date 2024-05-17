# 이미지 선택
FROM locustio/locust

# 작업 디렉토리 설정
WORKDIR /usr/src/app

# 호스트의 Locust 스크립트를 이미지 내부로 복사
COPY AddPosts.py .

# 컨테이너 시작 시 실행할 명령 설정
ENTRYPOINT ["locust"]

# 기본 명령어
CMD ["-f", "AddPosts.py", "--host=http://localhost:8080"]