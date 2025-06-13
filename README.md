## Spring Boot Redis Caching Example

A simple project that demonstrates how to use **Redis caching** in a Spring Boot REST API to improve performance.

---

### What is Caching?

**Caching** stores frequently used data in memory (like Redis) so your application can access it faster — avoiding slow and repeated database calls.

---

## 🛠 Steps Followed

1. Built a Spring Boot REST API to fetch Book data.
2. Added Redis for caching using `@Cacheable`.
3. Configured RedisCacheManager to store data as JSON.
4. Used Redis Commander to visually inspect cached data.
5. Compared performance before and after caching.

---

### How to Run

### Requirements:
- Java 23
- Maven
- Docker

### 1. Clone the repo
```bash
git clone https://github.com/sabrullafathima/spring-boot-redis-example.git
cd spring-boot-redis-example
