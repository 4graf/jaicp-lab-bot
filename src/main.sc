require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: hello
        intent!: /привет
        a: Привет привет

    state: weather1
        intent!: /weather
        a: Солнечно, но будет когда-то дождик
        
    state: currency
        intent!: /currency
        a: Рубль крепчает!

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}