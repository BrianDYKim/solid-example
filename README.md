# SpringBoot 3.2 보일러플레이트

# 사용 방법
1. git pull 이후에 아래의 커맨드를 통해 pre-commit phase 추가
```shell
./gradlew addKtlintCheckGitPreCommitHook
```

## KtLint
1. 린트 검사
```shell
./gradlew ktlintCheck
```

2. 자동 포맷팅
```shell
./gradlew ktlintFormat
```

3. pre-commit phase 에서 lint 체킹 ()
```shell
# 아래의 명령어를 통해 pre-commit phase ktlint check 추가
./gradlew addKtlintCheckGitPreCommitHook
```