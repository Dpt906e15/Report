#lang racket
(define Cup%
  (class object%
    (define holdsBall 0)

    (super-new)
    
    (define/public (AddBall)
      (set! holdsBall 1)
      )
    
    (define/public (HasBall)
      holdsBall)
))

(define cups (for/list ([i 15]) (new Cup%)))

(send (list-ref cups (random 15)) AddBall)

(define (StartGame)
  (println "Pick a cup between 1 and 15: ")
  (AskUser))

(define (AskUser)
   (define guess (read))
  (if (= (send (list-ref cups (- guess 1)) HasBall) 1)
      (println "Congratulation, you found it!")
     (begin
       (println "Miss! Try again, pick a cup between 1 and 15: ") (AskUser))))