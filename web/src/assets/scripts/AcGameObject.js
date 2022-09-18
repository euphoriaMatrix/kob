const AC_GAME_OBJECTS = []; // 游戏对象数组

export class AcGameObject {
    constructor() {
        AC_GAME_OBJECTS.push(this);
        this.timedelta = 0;
        this.has_called_start = false;  // 初始化未执行
    }

    start() {   // 只执行一次
    }

    update() {  // 每一帧执行一次, 除了第一帧以外
    }

    on_destroy() {  // 删除之前执行
    }

    destroy() {
        this.on_destroy();

        for (let i in AC_GAME_OBJECTS) {    // let in语法遍历的是下标
            const obj = AC_GAME_OBJECTS[i];
            if (obj == this) {
                AC_GAME_OBJECTS.splice(i);  // 从数组里删除元素
                break;
            }
        }
    }
}

let last_timestamp; // 上一次执行的时刻
const step = timestamp => {
    for (let obj of AC_GAME_OBJECTS) {  // 遍历数组元素
        if (!obj.has_called_start) {
            obj.has_called_start = true;
            obj.start();
        } else {
            obj.timestamp = timestamp - last_timestamp;
            obj.update();
        }
    }

    last_timestamp = timestamp;
    // 浏览器下一次渲染之前执行step
    requestAnimationFrame(step)
}

requestAnimationFrame(step)