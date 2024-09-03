package com.flipperdevices.core.ui.theme.composable.pallet.generated

import androidx.compose.ui.graphics.Color

/**
 * Autogenerated code from https://github.com/LionZXY/FlipperPalletGenerator/
 */
data class FlipperPalletV2(
    val text: Text,
    val surface: Surface,
    val action: Action,
    val illustration: Illustration,
    val category: Category,
    val icon: Icon,
) {
    data class Text(
        val title: Title,
        val body: Body,
        val label: Label,
        val caption: Caption,
        val semantic: Semantic,
        val link: Link,
    ) {
        data class Title(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
            val whiteOnColor: Color,
            val blackOnColor: Color,
        )

        data class Body(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
            val whiteOnColor: Color,
            val blackOnColor: Color,
        )

        data class Label(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
            val whiteOnColor: Color,
            val blackOnColor: Color,
        )

        data class Caption(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
            val whiteOnColor: Color,
            val blackOnColor: Color,
        )

        data class Semantic(
            val success: Color,
            val warning: Color,
            val danger: Color,
        )

        data class Link(
            val default: Color,
            val disabled: Color,
        )
    }

    data class Surface(
        val fade: Fade,
        val backgroundMain: BackgroundMain,
        val navBar: NavBar,
        val menu: Menu,
        val contentCard: ContentCard,
        val bottomBar: BottomBar,
        val sheet: Sheet,
        val dialog: Dialog,
        val popUp: PopUp,
        val searchBar: SearchBar,
        val border: Border,
    ) {
        data class Fade(
            val transparentBlack: TransparentBlack,
            val transparentWhite: TransparentWhite,
        ) {
            data class TransparentBlack(
                val primary: Color,
                val secondary: Color,
                val tertiary: Color,
            )

            data class TransparentWhite(
                val primary: Color,
                val secondary: Color,
                val tertiary: Color,
            )
        }

        data class BackgroundMain(
            val body: Color,
            val separator: Color,
        )

        data class NavBar(
            val body: Body,
        ) {
            data class Body(
                val main: Color,
                val accentBrand: Color,
            )
        }

        data class Menu(
            val body: Body,
            val separator: Separator,
        ) {
            data class Body(
                val dufault: Color,
            )

            data class Separator(
                val default: Color,
            )
        }

        data class ContentCard(
            val body: Body,
            val textField: TextField,
            val separator: Separator,
        ) {
            data class Body(
                val default: Color,
            )

            data class TextField(
                val default: Color,
                val danger: Color,
                val onColor: Color,
                val selected: Color,
            )

            data class Separator(
                val default: Color,
            )
        }

        data class BottomBar(
            val body: Color,
            val tabSelected: Color,
            val separator: Color,
        )

        data class Sheet(
            val body: Body,
            val separator: Separator,
        ) {
            data class Body(
                val default: Color,
            )

            data class Separator(
                val default: Color,
            )
        }

        data class Dialog(
            val body: Body,
            val illustrationField: IllustrationField,
            val separator: Separator,
        ) {
            data class Body(
                val default: Color,
            )

            data class IllustrationField(
                val default: Color,
            )

            data class Separator(
                val default: Color,
            )
        }

        data class PopUp(
            val body: Body,
        ) {
            data class Body(
                val default: Color,
            )
        }

        data class SearchBar(
            val body: Body,
            val searchField: SearchField,
        ) {
            data class Body(
                val default: Color,
            )

            data class SearchField(
                val default: Color,
            )
        }

        data class Border(
            val default: Default,
            val accentBrand: AccentBrand,
        ) {
            data class Default(
                val primary: Color,
                val secondary: Color,
                val tertiary: Color,
            )

            data class AccentBrand(
                val primary: Color,
                val secondary: Color,
                val tertiary: Color,
            )
        }
    }

    data class Action(
        val brunchRelease: BrunchRelease,
        val fwInstall: FwInstall,
        val blue: Blue,
        val neutral: Neutral,
        val brand: Brand,
        val fwUpdate: FwUpdate,
        val brunchRc: BrunchRc,
        val brunchDev: BrunchDev,
        val brunchCustom: BrunchCustom,
        val danger: Danger,
        val success: Success,
        val warning: Warning,
        val blackAndWhite: BlackAndWhite,
    ) {
        data class BrunchRelease(
            val text: Text,
        ) {
            data class Text(
                val default: Color,
                val disabled: Color,
            )
        }

        data class FwInstall(
            val background: Background,
            val text: Text,
            val icon: Icon,
            val border: Border,
        ) {
            data class Background(
                val primary: Primary,
                val secondary: Secondary,
                val tertiary: Tertiary,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                )
            }

            data class Text(
                val default: Color,
                val onColor: Color,
                val disabled: Color,
            )

            data class Icon(
                val default: Color,
                val onColor: Color,
                val disabled: Color,
            )

            data class Border(
                val primary: Primary,
                val color: Color,
                val secondary: Secondary,
                val tertiary: Tertiary,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                )
            }
        }

        data class Blue(
            val background: Background,
            val text: Text,
            val icon: Icon,
            val border: Border,
        ) {
            data class Background(
                val primary: Primary,
                val tertiary: Tertiary,
                val secondary: Secondary,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )
            }

            data class Text(
                val onColor: Color,
                val default: Color,
                val disabled: Color,
            )

            data class Icon(
                val default: Color,
                val onColor: Color,
                val disabled: Color,
            )

            data class Border(
                val tertiary: Tertiary,
                val primary: Primary,
                val secondary: Secondary,
            ) {
                data class Tertiary(
                    val disabled: Color,
                    val default: Color,
                )

                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )
            }
        }

        data class Neutral(
            val text: Text,
            val icon: Icon,
            val background: Background,
            val border: Border,
        ) {
            data class Text(
                val primary: Primary,
                val secondary: Secondary,
                val tertiary: Tertiary,
            ) {
                data class Primary(
                    val default: Color,
                    val onColor: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val onColor: Color,
                    val disabled: Color,
                    val default: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                    val onColor: Color,
                )
            }

            data class Icon(
                val primary: Primary,
                val secondary: Secondary,
                val tertiary: Tertiary,
            ) {
                data class Primary(
                    val default: Color,
                    val onColor: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val onColor: Color,
                    val disabled: Color,
                    val default: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val onColor: Color,
                    val disabled: Color,
                )
            }

            data class Background(
                val primary: Primary,
                val secondary: Secondary,
                val tertiary: Tertiary,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                )
            }

            data class Border(
                val primary: Primary,
                val tertiary: Tertiary,
                val secondary: Secondary,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val tertiary: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )
            }
        }

        data class Brand(
            val background: Background,
            val text: Text,
            val border: Border,
            val icon: Icon,
        ) {
            data class Background(
                val primary: Primary,
                val secondary: Secondary,
                val tertiary: Tertiary,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                )
            }

            data class Text(
                val default: Color,
                val onColor: Color,
                val disabled: Color,
            )

            data class Border(
                val primary: Primary,
                val secondary: Secondary,
                val tertiary: Tertiary,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val tertiary: Color,
                )
            }

            data class Icon(
                val default: Color,
                val onColor: Color,
                val disabled: Color,
            )
        }

        data class FwUpdate(
            val background: Background,
            val text: Text,
            val icon: Icon,
            val border: Border,
        ) {
            data class Background(
                val primary: Primary,
                val secondary: Secondary,
                val tertiary: Tertiary,
                val onColor: Color,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                )
            }

            data class Text(
                val default: Color,
                val onColor: Color,
                val disabled: Color,
            )

            data class Icon(
                val default: Color,
                val onColor: Color,
                val disabled: Color,
            )

            data class Border(
                val primary: Primary,
                val secondary: Secondary,
                val tertiary: Tertiary,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                )
            }
        }

        data class BrunchRc(
            val text: Text,
        ) {
            data class Text(
                val default: Color,
                val disabled: Color,
            )
        }

        data class BrunchDev(
            val text: Text,
        ) {
            data class Text(
                val default: Color,
                val disabled: Color,
            )
        }

        data class BrunchCustom(
            val text: Text,
        ) {
            data class Text(
                val default: Color,
                val disabled: Color,
            )
        }

        data class Danger(
            val text: Text,
            val icon: Icon,
            val border: Border,
            val background: Background,
        ) {
            data class Text(
                val default: Color,
                val onColor: Color,
                val disabled: Color,
            )

            data class Icon(
                val default: Color,
                val onColor: Color,
                val disabled: Color,
            )

            data class Border(
                val primary: Primary,
                val secondary: Secondary,
                val tertiary: Tertiary,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                )
            }

            data class Background(
                val tertiary: Tertiary,
                val primary: Primary,
                val secondary: Secondary,
            ) {
                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )
            }
        }

        data class Success(
            val background: Background,
            val text: Text,
            val icon: Icon,
            val border: Border,
        ) {
            data class Background(
                val primary: Primary,
                val secondary: Secondary,
                val tertiary: Tertiary,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                )
            }

            data class Text(
                val default: Color,
                val onColor: Color,
                val disabled: Color,
            )

            data class Icon(
                val default: Color,
                val onColor: Color,
                val disabled: Color,
            )

            data class Border(
                val primary: Primary,
                val secondary: Secondary,
                val tertiary: Tertiary,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                )
            }
        }

        data class Warning(
            val background: Background,
            val text: Text,
            val icon: Icon,
            val border: Border,
        ) {
            data class Background(
                val primary: Primary,
                val secondary: Secondary,
                val tertiary: Tertiary,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                )
            }

            data class Text(
                val default: Color,
                val onColor: Color,
                val disabled: Color,
            )

            data class Icon(
                val default: Color,
                val onColor: Color,
                val disabled: Color,
            )

            data class Border(
                val primary: Primary,
                val secondary: Secondary,
                val tertiary: Tertiary,
            ) {
                data class Primary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Secondary(
                    val default: Color,
                    val disabled: Color,
                )

                data class Tertiary(
                    val default: Color,
                    val disabled: Color,
                )
            }
        }

        data class BlackAndWhite(
            val text: Text,
            val icon: Icon,
            val border: Border,
        ) {
            data class Text(
                val default: Color,
                val disabled: Color,
            )

            data class Icon(
                val default: Color,
                val disabled: Color,
            )

            data class Border(
                val default: Color,
                val disabled: Color,
                val blackOnColor: Color,
                val whiteOnColor: Color,
            )
        }
    }

    data class Illustration(
        val danger: Danger,
        val success: Success,
        val warning: Warning,
        val neutral: Neutral,
        val brand: Brand,
        val blue: Blue,
        val blackAndWhite: BlackAndWhite,
        val transparent: Transparent,
    ) {
        data class Danger(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
        )

        data class Success(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
        )

        data class Warning(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
        )

        data class Neutral(
            val primary: Color,
            val quaternary: Color,
            val quinary: Color,
            val tertiary: Color,
            val secondary: Color,
        )

        data class Brand(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
        )

        data class Blue(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
        )

        data class BlackAndWhite(
            val white: Color,
            val black: Color,
            val whiteOnColor: Color,
            val blackOnColor: Color,
        )

        data class Transparent(
            val black: Black,
            val white: White,
        ) {
            data class Black(
                val primary: Color,
                val secondary: Color,
                val tertiary: Color,
            )

            data class White(
                val primary: Color,
                val secondary: Color,
                val tertiary: Color,
            )
        }
    }

    data class Category(
        val background: Background,
        val icon: Icon,
        val text: Text,
    ) {
        data class Background(
            val subGhz: SubGhz,
            val rfid: Rfid,
            val nfc: Nfc,
            val infrared: Infrared,
            val ibutton: Ibutton,
            val badUsb: BadUsb,
            val gpio: Gpio,
            val games: Games,
            val media: Media,
            val tools: Tools,
            val bluetooth: Bluetooth,
        ) {
            data class SubGhz(
                val default: Color,
                val disabled: Color,
            )

            data class Rfid(
                val default: Color,
                val disabled: Color,
            )

            data class Nfc(
                val default: Color,
                val disabled: Color,
            )

            data class Infrared(
                val default: Color,
                val disabled: Color,
            )

            data class Ibutton(
                val default: Color,
                val disabled: Color,
            )

            data class BadUsb(
                val default: Color,
                val disabled: Color,
            )

            data class Gpio(
                val default: Color,
                val disabled: Color,
            )

            data class Games(
                val default: Color,
                val disabled: Color,
            )

            data class Media(
                val default: Color,
                val disabled: Color,
            )

            data class Tools(
                val default: Color,
                val disabled: Color,
            )

            data class Bluetooth(
                val default: Color,
                val disabled: Color,
            )
        }

        data class Icon(
            val subGhz: SubGhz,
            val rfid: Rfid,
            val nfc: Nfc,
            val infrared: Infrared,
            val ibutton: Ibutton,
            val badUsb: BadUsb,
            val gpio: Gpio,
            val games: Games,
            val media: Media,
            val tools: Tools,
            val bluetooth: Bluetooth,
        ) {
            data class SubGhz(
                val default: Color,
            )

            data class Rfid(
                val default: Color,
            )

            data class Nfc(
                val default: Color,
            )

            data class Infrared(
                val default: Color,
            )

            data class Ibutton(
                val default: Color,
            )

            data class BadUsb(
                val default: Color,
            )

            data class Gpio(
                val default: Color,
            )

            data class Games(
                val default: Color,
            )

            data class Media(
                val default: Color,
            )

            data class Tools(
                val default: Color,
            )

            data class Bluetooth(
                val default: Color,
            )
        }

        data class Text(
            val subGhz: SubGhz,
            val rfid: Rfid,
            val nfc: Nfc,
            val infrared: Infrared,
            val ibutton: Ibutton,
            val badUsb: BadUsb,
            val gpio: Gpio,
            val games: Games,
            val media: Media,
            val tools: Tools,
            val bluetooth: Bluetooth,
        ) {
            data class SubGhz(
                val default: Color,
            )

            data class Rfid(
                val default: Color,
            )

            data class Nfc(
                val default: Color,
            )

            data class Infrared(
                val default: Color,
            )

            data class Ibutton(
                val default: Color,
            )

            data class BadUsb(
                val default: Color,
            )

            data class Gpio(
                val default: Color,
            )

            data class Games(
                val default: Color,
            )

            data class Media(
                val default: Color,
            )

            data class Tools(
                val default: Color,
            )

            data class Bluetooth(
                val default: Color,
            )
        }
    }

    data class Icon(
        val neutral: Neutral,
        val onColor: OnColor,
        val success: Success,
        val warning: Warning,
        val danger: Danger,
        val blackAndWhite: BlackAndWhite,
        val brand: Brand,
        val blue: Blue,
    ) {
        data class Neutral(
            val primary: Primary,
            val secondary: Secondary,
            val tertiary: Tertiary,
            val quaternary: Quaternary,
            val quinary: Quinary,
        ) {
            data class Primary(
                val default: Color,
                val transparent: Color,
            )

            data class Secondary(
                val default: Color,
                val transparent: Color,
            )

            data class Tertiary(
                val default: Color,
                val transparent: Color,
            )

            data class Quaternary(
                val default: Color,
            )

            data class Quinary(
                val default: Color,
            )
        }

        data class OnColor(
            val white: White,
            val black: Black,
        ) {
            data class White(
                val default: Color,
                val transparent: Color,
            )

            data class Black(
                val default: Color,
                val transparent: Color,
            )
        }

        data class Success(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
        )

        data class Warning(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
        )

        data class Danger(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
        )

        data class BlackAndWhite(
            val default: Color,
            val transparent: Color,
            val blackOnColor: Color,
            val whiteOnColor: Color,
        )

        data class Brand(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
        )

        data class Blue(
            val primary: Color,
            val secondary: Color,
            val tertiary: Color,
        )
    }
}