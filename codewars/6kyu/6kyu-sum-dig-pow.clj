;Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!

; 숫자 분리 123 -> ["1" "2" "3"]
(defn get-digs [dig]
  (let [str_number (str dig)]
    (loop [start 0 max (count str_number) result []]
      (if (>= start max)
        result
        (recur (inc start) max (conj result (subs str_number start (inc start))))))))

; 숫자를 자리수 제곱을 합한다. 123 => 1 + 2^2 + 3^3
(defn get-sum-digs-pow [digs]
  (let [dig_list (get-digs digs)]
    (loop [start 0 max (count dig_list) sum (int 0)]
      (if (>= start max)
        sum
        (recur (inc start) max
               (-> (get dig_list start 0) (Integer/parseInt) (Math/pow (inc start)) (int) (+ sum)))))))

; 최종 함수
(defn sum-dig-pow [a b]
  (for [x (range a b) :when (= x (get-sum-digs-pow x))] x)
)

