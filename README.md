## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

--- 
## 기능 요구사항
- [x] Car Instance 추가
  - [x] 자동차 이름 입력 받기(자동차이름은 쉼표를 기준으로 구분)
  - [x] Cars Instance 추가
  - [x] Car Instance 추가
  - [x] Car Names 추가
  - [x] Car Location 추가
  - [x] Lap 추가
  - [x] Car Name Instance 추가 (자동차 이름 null, 공백, 5자 초과 불가)
- [x] 시도 횟수 입력
- [x] 게임시작
   - [x] 회차별 자동차는 진전 또는 정지를 한다.
        - 4이상 전진, 그 이외는 정지  
   - [x] 회차별 실행결과 출력
- [x] 자동차 경주 게임 완료 후 누가 우승했는지 출력 (우승자는 한명이상일 수 있다)