# 🧭 Core Flow
![image](https://github.com/user-attachments/assets/a7ebb0be-58bb-4c90-8be7-1cdcc02a54d0)

<br>

## 유동성 있는 일정 관리를 위한 ERP 시스템 : Core Flow💡 

🔹 **Core – 핵심을 놓치지 않는 시스템** <br>
   > 프로젝트 기반 기업에서는 핵심 일정과 주요 업무 흐름을 놓치지 않는 것이 중요합니다. <br>
CoreFlow는 복잡한 프로젝트 속에서도 우선순위가 높은 일정, 중요한 프로세스 흐름을 중심에 두고 설계되었습니다.

🔹 **Flow – 유동적인 업무 흐름과 일정** <br>
> 실제 현장에서는 계획된 일정이 그대로 흘러가지 않는 경우가 많습니다. <br>
CoreFlow는 유연하게 바뀌는 일정과 업무 상황에 실시간으로 반응하며 직관적인 흐름(view)으로 업무 변화를 빠르게 파악하고 조정할 수 있게 돕습니다.

<br>

---


## 🎯 CoreFlow는 이런 기업을 위해 설계되었습니다.
> **CoreFlow는 프로젝트 중심 기업을 위한 ERP입니다.** <br>

🔹 프로젝트 중심으로 운영되는 팀 또는 기업 <br>
🔹 팀 간 협업과 일정 조율이 복잡하고 자주 바뀌는 환경 <br>
🔹 Gantt, Pipeline 등 프로세스 시각화를 통해 한눈에 업무 흐름을 보고 싶은 기업 <br>


<br>

---

## ℹ️ 기획 배경 및 서비스 방향성

### 소비자 Pain Point
> "일정을 직관적으로 파악하기 어려워요."
"정보가 여기저기 흩어져 있어요."
"일정 마감 알림이 없어 불편해요."

### 주요 문제점
- 직관성 부족: 뷰는 많지만, 연동되지 않아 전체 흐름 파악이 어려움
- 정보의 분산: 상위 일정에서 하위 일정을 일일이 확인해야 함
-  알림 기능 부재: 일정 지연, 마감, 승인 등 주요 이벤트에 대한 알림 부족
- 높은 진입 장벽: 복잡한 UI와 수동 설정 요구로 사용자 부담 증가


![image](https://github.com/user-attachments/assets/9f8a0f97-cbf4-43f1-94f6-d40255697e55)

![image](https://github.com/user-attachments/assets/07d0a42c-66f4-47e0-9128-56f791e821e9)

### ✅ CoreFlow의 서비스 방향성
- 📅 **직관적인 일정 시각화**  : 간트 차트 + 파이프라인 + 캘린더 통합 제공

- 🧩 **정보 통합**  : 상위 일정에서 하위 일정의 핵심 정보를 한눈에 확인

- 🔔 **알림 시스템**  : 모든 상태 변화에 대해 실시간 알림 제공

- 🧠 **자동화된 흐름**  : 반복 일정, 의존 일정 자동 설정 및 지연 전파

- 📄 **보고서 자동 생성**  : 프로젝트 상태 보고서 PDF 자동화

- 🧰 **템플릿 기능**  : 자주 쓰는 일정/공정을 템플릿으로 재사용 가능

<br>

--- 

## 🚀 프로젝트 이동

CoreFlow는 **프론트엔드**와 **백엔드**가 분리된 구조로 개발되었으며,  
아래 링크를 통해 각 레포지토리 및 실제 배포 사이트에 접근할 수 있습니다.

<br >

#### 🖥️ 프론트엔드 레포지토리 : [GitHub - CoreFlow Frontend](https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow-front)

#### 🛠️ 백엔드 레포지토리 : [GitHub - CoreFlow Backend](https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow-back)

#### 🌐 실제 배포 사이트 : [🔗 core-flow.site](https://core-flow.site)


<br>

---

## 📚 목차


- [프로젝트 개요](#-프로젝트-개요)
- [기획 의도](#-기획-의도)
- [서비스 주요 기능](#-서비스-주요-기능)
- [기술 스택](#-기술-스택)
- [외부 API 및 주요 구현 기술](#-외부-api-및-주요-구현-기술)
- [프로젝트 기획](#-프로젝트-기획)
- [프로젝트 설계](#-프로젝트-설계)
- [팀원별 회고 모음](#-팀원별-회고-모음)

<br>

--- 
 

## 🚀 서비스 주요 기능

### 💬 커뮤니케이션
<details>
<summary>태스크 단위 댓글 및 공지 기능</summary>

- 각 태스크에 직접 댓글을 달아 맥락 속 소통 가능  
- 팀원 간 업무 공유, 피드백, 공지를 하나의 흐름에서 처리

</details>

<details>
<summary>자료 공유 및 검색</summary>

- 댓글 내 파일 첨부 가능  
- 프로젝트 내 자료를 태스크, 프로젝트 단위로 검색 가능

</details>

<details>
<summary>알림 기능</summary>

- 댓글 멘션, 공지, 일정 임박 등 중요 이벤트에 대해 실시간 알림 제공  
- Slack이나 메일 없이도 시스템 내에서 즉시 확인 가능

</details>

### 📅 일정 관리

<details>
<summary>간트차트</summary>

- 전체 프로젝트 일정을 타임라인 기반으로 시각화  
- 프로젝트 일정, 기존 계획 대비 지연 여부를 한눈에 파악

</details>

<details>
<summary>파이프라인</summary>

- 프로젝트 흐름을 태스크 단위로 나열  
- 태스크의 진행상황 및 선후관계를 직관적으로 확인 가능

</details>

<details>
<summary>캘린더</summary>

- 부서별 세부 일정과 개인 일정 동시 확인 가능  
- 달력 형태 UI로 가시성 및 일정 조율 용이

</details>

<details>
<summary>지연 전파 기능</summary>

- 지연 발생 시 후속 태스크 일정 자동 반영  
- 수기 조정 없이 전체 일정 흐름 실시간 관리  
- 일정 리스크 사전 인지 → 납기 준수율 향상  
- 실제 작업 흐름 기반으로 계획-실행 간 격차 최소화

</details>

<details>
<summary>템플릿</summary>

- 반복되는 프로젝트는 템플릿으로 저장  
- 새로운 프로젝트 생성 시 활용 → 반복 작업 최소화  
- 프로젝트 흐름 표준화  
- 재사용성과 일관성 확보 및 업무 속도 향상

</details>



### 📈 성과 가시성 도구
<details>
<summary>KPI 기반 프로젝트 분석 리포트 PDF 제공</summary>
   
  - 프로젝트 결과를 정량  지표 기반으로 자동 분석
  - 진행률, 완료율, 지연일 등 주요 항목 포함
  - 외부 보고 및 조직 아카이빙용 PDF로 자동 저장 및 공유 가능
  - ERP 시스템과 연계 가능한 일정 기반 리포트 허브 기능 수행


</details>


<br>

---
  
## 🛠 기술 스택

### 🧩 Backend
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)

### 🎨 Frontend
![Vue.js](https://img.shields.io/badge/Vue.js-4FC08D?style=for-the-badge&logo=vue.js&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![Vuetify](https://img.shields.io/badge/Vuetify-1867C0?style=for-the-badge)
![Vue Router](https://img.shields.io/badge/Vue_Router-4FC08D?style=for-the-badge)
![Pinia](https://img.shields.io/badge/Pinia-FADA5E?style=for-the-badge&logo=pinia&logoColor=black)
![Axios](https://img.shields.io/badge/Axios-5A29E4?style=for-the-badge)

### 🗄 Database / Infra
![MariaDB](https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariadb&logoColor=white)
![Redis](https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=redis&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white)
![Amazon S3](https://img.shields.io/badge/Amazon_S3-569A31?style=for-the-badge&logo=amazonaws&logoColor=white)

### 🧰 Tools
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![Figma](https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![Discord](https://img.shields.io/badge/Discord-5865F2?style=for-the-badge&logo=discord&logoColor=white)

<br>

---

## 🌐 외부 API 및 주요 구현 기술
| 구분 | 기술 / API | 설명 |
|------|------------|------|
| 실시간 알림 | SSE (Server-Sent Events) | 팔로우/게시글 알림 푸시 |
| 인증 | JWT | 사용자 로그인/회원가입 인증 관리 |
| 배포 환경 | AWS | 컨테이너 기반 인프라 관리 |
| 정적 파일 | Amazon S3 | 이미지, 오디오 파일 업로드/호스팅 |


<br>

---

## 🗂 프로젝트 기획
<details>
<summary>프로젝트 기획서</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/blob/main/%EC%82%B0%EC%B6%9C%EB%AC%BC/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EA%B8%B0%ED%9A%8D%EC%84%9C.pdf">프로젝트 기획서</a>
</details>

<details>
<summary>요구사항 명세서</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/blob/main/%EC%82%B0%EC%B6%9C%EB%AC%BC/%EC%9D%B4%EC%83%81_Document%20-%20%ED%8C%8C%EC%9D%B4%EB%84%90-%EC%9A%94%EA%B5%AC%EC%82%AC%ED%95%AD%20%EB%AA%85%EC%84%B8%EC%84%9C.pdf">요구사항 명세서</a>
</details>

<details>
<summary>WBS</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/blob/main/%EC%82%B0%EC%B6%9C%EB%AC%BC/%EC%9D%B4%EC%83%81_Document%20-%20%ED%8C%8C%EC%9D%B4%EB%84%90-WBS.pdf">WBS</a>
</details>

<br>

---

## 🗂 프로젝트 설계

<details>
<summary>ERD</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/blob/main/%EC%82%B0%EC%B6%9C%EB%AC%BC/ERD.png">ERD</a>
</details>

<details>
<summary>화면 설계서</summary>
</details>

<details>
  <summary>프로그램 사양서</summary>
  <a href="https://ohgiraffers.notion.site/API-1ff649136c11819ebb31f39462e4f0f9?pvs=73">프로그램 사양서</a>
</details>

<details>
<summary>🕹️ 시스템 아키텍쳐</summary>
  <a href="https://github.com/2TEAM-Ideality/be14-final-Ideality-CoreFlow/blob/main/%EC%82%B0%EC%B6%9C%EB%AC%BC/core-flow-architecture.drawio_2.png">시스템 아키텍쳐
</details>

<details>
<summary>🔄 CI / CD</summary>
  <a href="https://ohgiraffers.notion.site/CI-CD-21f649136c1180758569e7f7974cfb85?pvs=73">CI / CD 계획서</a>
</details>

<details>
  <summary>단위 테스크 결과서</summary>
  <a href="https://documenter.getpostman.com/view/43225655/2sB2xFgTc9">단위 테스트 결과서</a>
</details>

<br> 

---

## 📝 팀원별 회고 모음

| 이혜영 | 정민선 | 정동한 | 권민수 | 장시원 |
|--------|--------|--------|--------|--------|
| <div align="center"><img src="https://github.com/user-attachments/assets/f589b013-0193-4775-a908-76305427112c" width="180"><br>ISTP</div> | <div align="center"><img src="https://github.com/user-attachments/assets/2a9c8c91-0afa-4fa0-b10c-f4ad94bd9a09" width="180"><br>INFJ</div> | <div align="center"><img src="https://github.com/user-attachments/assets/05d7d9de-3c77-4243-a553-fcfb24abc6e9" width="180"><br>ISTP</div> | <div align="center"><img src="https://github.com/user-attachments/assets/b695d9dc-9885-4731-9c6a-6dde1add62f9" width="180"><br>ISTP</div> | <div align="center"><img src="https://item.kakaocdn.net/do/eda86b27d953e0a1bc89848fff989e65f604e7b0e6900f9ac53a43965300eb9a" width="180"><br>INTJ</div> |


<br>

### 🙋‍♀️ 팀원 이혜영 - @Hailyee

- **이번 프로젝트에서 맡은 역할**
  - UI 설계
  - 알림(SSE) 이벤트 기능
  - 세부 일정 기능

- **잘한 점**
  -

- **아쉬운 점**
  - 

- **배운 점**
  - 


- **다음 프로젝트에 적용하고 싶은 점**
  -                                  

---

### 🙋‍♀️ 권민수 - @mins00kwon

- **이번 프로젝트에서 맡은 역할**
  - 발표
  - PM
  - 프로젝트 기능

- **잘한 점**
  -

- **아쉬운 점**
  - 

- **배운 점**
  -  
  
- **다음 프로젝트에 적용하고 싶은 점**
  -   
---

### 🙋‍♀️ 팀원 정동한 - @rainyday1367

- **이번 프로젝트에서 맡은 역할**
  - CI/CD
  - 시스템 아키텍처 구축
  - 댓글 기능 
  - 태스크 기능

- **잘한 점**
  - 

- **아쉬운 점**
  - 

- **배운 점**
  - 

- **다음 프로젝트에 적용하고 싶은 점**
  - 

---

### 🙋‍♀️ 장시원 - @swjang7269

- **이번 프로젝트에서 맡은 역할**
  - DB 모델링
  - 멀티 테넌시 구축
  - 회원 기능 
  - 결재 기능 
 
- **잘한 점**
  - 

- **아쉬운 점**
  - 
 
- **배운 점**
  - 
 
- **다음 프로젝트에 적용하고 싶은 점**
  - 

---

### 🙋‍♀️ 정민선 - @minsun24

- **이번 프로젝트에서 맡은 역할**
  - 피그마를 이용한 UI/UX 설계 및 프론트엔드 개발 총괄
  - 템플릿 기반 워크플로우 생성 기능 구현 (VueFlow 기반)
  - 프로젝트 분석 리포트 PDF 생성 기능 구현 (OpenHTMLtoPDF)

- **잘한 점**
  - 처음 사용해보는 라이브러리 (VueFlow, PDF 생성)를 습득해서 실제 서비스에 적용했음
  - API 문서화, 커스텀 예외 처리 및 공통 에러 응답 구조를 잘 지킴
  - 복잡한 기능 요구사항을 실무 관점에서 풀어내며, 일정 흐름과 협업 구조를 시스템화한 점
  - 사용자 경험을 고려한 UI 흐름과 전체 화면 구성 기획

- **아쉬운 점**
  - 작업량이 많아 일부 화면은 마무리 작업이나 세부적인 UI 다듬기가 조금 부족했던 점
  - 프론트와 백 간 인터페이스 정의에 있어 초반에 일부 혼선이 있었던 점

- **배운 점**
  - VueFlow 기반 워크플로우를 다루며 복잡한 데이터 흐름 구조와 의존성 관리에 대한 이해가 높아짐
  - PDF 생성, 일정 자동화, 지연 전파 등 실무 친화적인 기능 구현 경험
  - 협업 시 API 명세와 상태 관리를 얼마나 세심히 정리해야 하는지 깨달음
  - PDF 생성 기능(OpenHTMLtoPDF)을 구현하면서, 빌드 환경에서의 정적 리소스 처리 방식, 그리고 로컬 개발과 배포 환경 차이를 깊이 이해하게 되었음
     - PDF 폰트 경로 문제로 배포 환경에서 빌드 실패를 겪었고, 이를 ClassPathResource + InputStream 방식으로 해결하며 빌드 환경 내 리소스 처리 방식 이해
     - 실제 배포된 서버에서는 PDF 폰트 파일이 로컬 src 경로를 기준으로 참조되어 빌드 시 에러 발생 → 이를 해결하기 위해 ClassPathResource에서 InputStream으로 폰트를 읽어오는 방식으로 수정
      ```
      try (InputStream fontStream = new ClassPathResource("fonts/NotoSansKR-Regular.ttf").getInputStream()) {
       renderer.getFontResolver().addFont(fontStream, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
      }   
     ```



- **다음 프로젝트에 적용하고 싶은 점**
  - 초기 설계 단계에서부터 정적 리소스 처리 방식과 배포 환경을 고려한 구조 설계
  - 공통 모듈, 유틸성 처리, 컴포넌트 재사용성 등을 고려한 아키텍처 설계
  - 협업 시 API 문서 및 상태 관리를 문서화하고 공유하는 습관화
 
