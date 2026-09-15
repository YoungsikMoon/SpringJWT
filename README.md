# SpringJWT

## 실행 설정

프로세스 환경변수 `JWT_SECRET`에 32바이트 이상의 안전한 임의 비밀값을 설정하세요. 값이 없거나 너무 짧으면 시작할 수 없습니다. 비밀값은 설정 파일이나 Git에 저장하지 마세요. Spring Boot는 이 프로젝트에서 `.env` 파일을 자동으로 읽지 않습니다.

서명값을 교체하면 이전 값으로 발급한 JWT는 더 이상 검증되지 않습니다.

## 설정 검증

`./gradlew test --tests com.example.SpringJWT.jwt.JWTUtilTest`
