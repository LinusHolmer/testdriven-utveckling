/** TODO : Important steps
 * Does:
 * describe exist
 * it exist
 * test exist
 * getByText
 * render()
 * expect().toBe()
 */


import CustomButton from "./CustomButton";
import {fireEvent, render} from "@testing-library/react";
import "@testing-library/jest-dom"
import "@testing-library/react"


describe("Easy Examples", () => {

    // Test #1
    test("2 + 2 = 4", () => {
        expect(2+2).toBe(4);
    })

    // Test #2
    test("is 2+4 greater than 0", () => {
        expect(2+4).toBeGreaterThan(0);
    })

    // Tes #3
    test("2-2 = 0", () => {
        expect(2-2).toBe(0);
    })
})

describe("Custom Button Component States", () => {
    //Idle
    test("Check if Button Component starts with Idle", () => {
        const buttonText: string = "signup";
        const { getByText } = render(<CustomButton  buttonText={buttonText} />)
        const customButtonComponent = getByText(buttonText)

        expect(customButtonComponent).toHaveClass(ButtonState.idle)
    })

    //Hover
    test("Check if Button Component on hover state changes", () => {
        const buttonText: string = "signup";
        const { getByText } = render(<CustomButton  buttonText={buttonText} />)
        const customButtonComponent = getByText(buttonText)

        expect(customButtonComponent).toHaveClass(ButtonState.idle)
        fireEvent.mouseEnter(customButtonComponent)
        expect(customButtonComponent).toHaveClass(ButtonState.hover)
    })

    //Clicked
    test("Custom Button Component on click state change", () => {
        const buttonText: string = "signup";
        const { getByText } = render(<CustomButton  buttonText={buttonText} />)
        const customButtonComponent = getByText(buttonText)

        expect(customButtonComponent).toHaveClass(ButtonState.idle)
        fireEvent.mouseEnter(customButtonComponent)
        expect(customButtonComponent).toHaveClass(ButtonState.clicked)
    })
})

it("", () => {})
test("", () => {})