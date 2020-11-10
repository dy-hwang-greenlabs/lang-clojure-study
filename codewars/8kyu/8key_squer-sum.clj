;Square (n) Sum
;For example, for [1, 2, 2] it should return 9 because 1 ^2 + 2 ^2 + 2 ^2 = 9.

(defn square-sum [lst]
  (if (empty? lst) 0
      (int
       (loop [cal (first lst) pop_list (rest lst) sum (int 0)]
         (if (empty? pop_list)
           (+ (Math/pow cal 2) sum)
           (recur (first pop_list)
                  (rest pop_list) (+ (Math/pow cal 2) sum)))))))

; square-sum2 lazyseq 에러발생
(defn square-sum2 [lst]
  (if (empty? lst) 0
      (int
       (loop [cal (peek lst) pop_list (pop lst) sum (int 0)]
         (if (empty? pop_list)
           (+ (Math/pow cal 2) sum)
           (recur (peek pop_list)
                  (pop pop_list) (+ (Math/pow cal 2) sum)))))))

