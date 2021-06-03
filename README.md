# Spring Boot를 이용한 RESTful Web Service 개발

![Java_11](https://img.shields.io/badge/java-v11-red?logo=java&style=flat-square&logoColor=white)
![Spring_Boot](https://img.shields.io/badge/Spring_Boot-v2.5.0-6DB33F.svg?logo=spring&style=flat-square&logoColor=white)
![Spring_Security](https://img.shields.io/badge/Spring_Security-6DB33F.svg?style=flat-square&logo=spring&logoColor=white)
![Spring_Data_JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F.svg?style=flat-square&logo=spring&logoColor=white)
![MariaDB](https://img.shields.io/badge/MariaDB-003545.svg?style=flat-square&logo=MariaDB&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=flat-square&logo=Gradle&logoColor=white)

1. 사용자 관리 API
* 전체 사용자 목록 조회: GET HTTP Method, http://localhost:8088/users
* 개별 사용자 조회: GET HTTP Method, http://localhost:8088/users/{id}
* 사용자 삭제: DELETE HTTP Method, http://localhost:8088/users/{id}
* 사용자 정보 수정: PUT HTTP Method, http://localhost:8088/users/{id}

2. 게시물 관리 API
* 전체 게시물 목록 조회: GET HTTP Method, http://localhost:8088/users/{id}/posts
* 게시물 삭제: DELETE HTTP Method, http://localhost:8088/users/{id}/posts/{post_id}